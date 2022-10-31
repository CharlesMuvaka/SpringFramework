package com.cleanjava;

import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean {
	private int age, salary;
	private String name, department;
	
	public Employee() {
		
	}

	public Employee(int age, int salary, String name, String department) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("The bean has been initialised, therefore do something");
	}


}
