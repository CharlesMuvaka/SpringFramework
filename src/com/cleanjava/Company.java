package com.cleanjava;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {
	
	private String name, location;
	private Address address;
	private List<Employee> employees;
	private Set<String> departments;
	private Map<String, Employee> employeeDepartments;
	
	
	
	public Company( Address add) {
		this.address = add;
	}
	
	public Company() {
	}


	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Set<String> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<String> departments) {
		this.departments = departments;
	}

	public Map<String, Employee> getEmployeeDepartments() {
		return employeeDepartments;
	}

	public void setEmployeeDepartments(Map<String, Employee> employeeDepartments) {
		this.employeeDepartments = employeeDepartments;
	}

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
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
	
	public void destroy() {
		System.out.println("This company bean has be disposed, No data concerning it will be available");
	}

}
