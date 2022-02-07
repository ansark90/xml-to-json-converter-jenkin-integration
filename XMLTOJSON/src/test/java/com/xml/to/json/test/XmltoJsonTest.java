package com.xml.to.json.test;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.ObjectMapper;

public class XmltoJsonTest {
	public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	public static void main(String[] args) {
		String x="<Employees>\r\n"
				+ "     <Employee>\r\n"
				+ "		  <id>101</id >\r\n"
				+ "          <Firstname>Dean</Firstname >\r\n"
				+ "          <Lastname>Winchester</Lastname>\r\n"
				+ "          <Age>30</Age>\r\n"
				+ "          <Salary>2500</Salary>\r\n"
				+ "     </Employee>\r\n"
				+ "      <Employee>\r\n"
				+ "		  <id>102</id >\r\n"
				+ "          <Firstname>Sam</Firstname>\r\n"
				+ "          <Lastname>Davis</Lastname>\r\n"
				+ "          <Age>22</Age>\r\n"
				+ "          <Salary>1500</Salary>\r\n"
				+ "     </Employee>\r\n"
				+ "      <Employee>\r\n"
				+ "		  <id>103</id >\r\n"
				+ "          <Firstname>Jake</Firstname>\r\n"
				+ "          <Lastname>Peralta</Lastname>\r\n"
				+ "          <Age>24</Age>\r\n"
				+ "          <Salary>2000</Salary>\r\n"
				+ "     </Employee>\r\n"
				+ "      <Employee>\r\n"
				+ "		  <id>104</id >\r\n"
				+ "          <Firstname>Amy</Firstname>\r\n"
				+ "          <Lastname>Griffin</Lastname>\r\n"
				+ "          <Age>25</Age>\r\n"
				+ "          <Salary>2250</Salary>\r\n"
				+ "     </Employee>\r\n"
				+ "</Employees>";
		
	    JSONObject json=XML.toJSONObject(x); 
	    System.out.println(json);
	    
	}
}
