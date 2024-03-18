package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		
		
		Demo d1 = (Demo) context.getBean("demo");
		
		System.out.println(d1);
		
	}
}
