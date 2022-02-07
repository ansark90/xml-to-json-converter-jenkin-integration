package com.xml.to.json.test.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
	@JsonProperty("employee") 
    public List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
