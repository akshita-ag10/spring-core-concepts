package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired //(putting @ here doesn't call setter or constructor)
	@Qualifier("temp2") // if more than 1 address bean exist, provide the name of the the one you want to inject using Qualifier annotation
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//@Autowired //(putting @ here calls setter method)
	//@Qualifier("temp2")
	public void setAddress(Address address) {
		System.out.println("Calling Emp set method");
		this.address = address;
	}
	
	//@Autowired // (putting @ here calls constructor)
	//Qualifier annotation can not be used at Constructor
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Calling Emp constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
