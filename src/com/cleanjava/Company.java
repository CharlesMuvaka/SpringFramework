package com.cleanjava;

public class Company {
	private String name, location;
	
	

	public Company() {
	}
	
	
	public Company(String name, String location) {
		this.name = name;
		this.location = location;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void init() {
		System.out.println("A company instance has been created, Please do something");
	}
	

}
