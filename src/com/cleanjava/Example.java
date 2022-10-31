package com.cleanjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("Beans.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e.getSalary());
		
		
	}

}
