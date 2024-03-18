package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");

		//you need to use AbstractApplicationContext interface instead of ApplicationContext interface
		// to call destroy method you need registerShutdownHook method which is only in AbstractApplicationContext Interface
		// AbstractApplicationContext is the parent Interface of ApplicationContext
		
		context.registerShutdownHook();
		
		
		Samosa s = (Samosa) context.getBean("samosa");
		System.out.println(s);
		
		
		Pepsi p = (Pepsi) context.getBean("pep");
		System.out.println(p);
		
		
		Burger b = (Burger) context.getBean("burger");
		System.out.println(b);
		
		
		
		
		
	}

}