package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireConfig.xml");
		
		// instead of typecasting into Emp you can also use Emp.class as attribute
		Emp e = context.getBean("emp", Emp.class);
		System.out.println(e);
	}
}
