package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class SpringDemo {
	
	public static void main(String[] args) {
		
		//using xml based annotation
//		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Person person1 = (Person)context.getBean("person");// give the id of the class from ApplicationContext.xml file
//		Person person2 = (Person)context.getBean("person");
//		person2.setFirstName("mithun");
//		System.out.println("first name is : " +person1.getFirstName());
//		System.out.println("first name is : " +person2.getFirstName());
//		
//		
//		Car car1 = (Car)context.getBean("car");
//		System.out.println("car brand name is : "+ car1.getModel());
		
//		Person person1 = (Person)context.getBean("person");
//		System.out.println(person1.getPersonDetails());
		
		
		
		//using java based annotation
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = (Person)context.getBean(Person.class);
		System.out.println(person.getPersonDetails());
		
		
		
	}

}
