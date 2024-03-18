package com.springcore.autowire.annotations;

public class Address {
	
	private String Street;
	private String City;
	
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		System.out.println("Calling Street set method");
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		System.out.println("Calling City set method");
		City = city;
	}
	public Address(String street, String city) {
		super();
		Street = street;
		City = city;
		System.out.println("calling Address Constructor");
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + "]";
	}
	
	

}
