package com.xml.to.json.test.service;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xml.to.json.test.bean.Root;

@Service
public class XmlToJsonService {
	public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
public Root xmlToJsonData(String xmlDatta) throws JsonMappingException, JsonProcessingException {
		JSONObject jsonObject = XML.toJSONObject(xmlDatta);
		System.out.println(jsonObject);
		Root myPojo = OBJECT_MAPPER.readValue(jsonObject.toString(), Root.class);
		
		String strdata= OBJECT_MAPPER.writeValueAsString(myPojo);
		System.out.println(strdata);
		System.out.println("this is jsonObject of mypojo "+ OBJECT_MAPPER.valueToTree(myPojo));
		return myPojo;
		//return myPojo.getEmployee();
	}
}
