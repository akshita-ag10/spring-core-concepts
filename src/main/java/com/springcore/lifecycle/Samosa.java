package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("setting samosa price");
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}
	
	public Samosa() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	

	public void initVala() {
		System.out.println("init method called");
	}
	
	public void destroyVala() {
		System.out.println("destroy method called");
	}

}
