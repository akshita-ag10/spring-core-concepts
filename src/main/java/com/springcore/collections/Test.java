package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsConfig.xml");
		Emp e1 = (Emp) context.getBean("emp1");
		System.out.println(e1);
		
		//by default the type of list form through config xml file is ArrayList
		
		System.out.println(e1.getPhones().getClass().getName());
		
		//you can choose the Implementation class for list interface, i.e. you can choose the type of list by using 
		//util:list -- 	SEE STNAND ALONE COLLECTIONS
		
		

	}

}
