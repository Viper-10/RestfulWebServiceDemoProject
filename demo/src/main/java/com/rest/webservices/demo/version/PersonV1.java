package com.rest.webservices.demo.version;

public class PersonV1 {
	private String name;

	public PersonV1() {
		
	}
	
	public PersonV1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
