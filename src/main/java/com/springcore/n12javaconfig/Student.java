package com.springcore.n12javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//now this component will be scaned as we provide the base package in java config file

//@Component  				//since no bean name is provided here, class name in camelCase will be considered to getBean()
public class Student {
	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void read() {
		System.out.println("reading his book");
		this.samosa.display();
	}
	



	
}
