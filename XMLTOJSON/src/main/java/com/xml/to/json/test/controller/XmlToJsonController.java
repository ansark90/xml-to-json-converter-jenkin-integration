package com.xml.to.json.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.xml.to.json.test.bean.Employee;
import com.xml.to.json.test.bean.Root;
import com.xml.to.json.test.service.XmlToJsonService;

@RestController
@RequestMapping("/xmlData")
public class XmlToJsonController {

	@Autowired
	private XmlToJsonService xmlToJsonService;

	@PostMapping("/")
	public ResponseEntity<?> xmlToJsonData(HttpServletRequest request)throws JsonMappingException, JsonProcessingException {

		String xmlDatta = request.getParameter("msg");
		System.out.println("DataPrint: " + xmlDatta);
		// List<Employee> listOfEmp = xmlToJsonService.xmlToJsonData(xmlDatta);
		Root listOfEmp = xmlToJsonService.xmlToJsonData(xmlDatta);
		return new ResponseEntity<Root>(listOfEmp, HttpStatus.OK);
		// return new ResponseEntity<List<Employee>>(listOfEmp,HttpStatus.OK);
		
	}
}
