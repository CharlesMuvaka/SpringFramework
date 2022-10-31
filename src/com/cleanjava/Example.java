package com.cleanjava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Spring IoC containers
		// 1. BeanFactory - provides basic support for Di and used for small applications
		// 2. ApplicationConext
		
		//BeanFactory implementation
		//XmlBeanFactory class is an implemantation that reads metadata from an xml configuration file and develops an application.
		
		BeanFactory factory  = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		Employee emp = (Employee) factory.getBean("employee");
		System.out.println(emp.getAge());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp1 = (Employee) context.getBean("employee");
		System.out.println(emp1.getName());
		
		
	}

}
