package com.springcore.n12javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		//Application Context interface have 3 implementation classes
		//ClassPathXmlApplicationContext
		//FileSystemXmlApplicationContext
		//AnnotationConfigApplicationContext
		
		//here since we are using java config, use that 3rd one implementation class
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJavaClass.class);
		Student s = (Student) context.getBean("s1");
		
		System.out.println(s);
		s.read();
	
	}

}
