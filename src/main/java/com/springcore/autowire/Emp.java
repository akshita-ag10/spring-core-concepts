package com.springcore.autowire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Calling Emp set method");
		this.address = address;
	}

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
