package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Burger {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Burger(double price) {
		super();
		this.price = price;
	}

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Burger [price=" + price + "]";
	}
	
	
	//METHOD FOR INIT
	@PostConstruct
	public void start() {
		System.out.println("taking burger: init");
	}
	
	//METHOD FOR DESTROY
	@PreDestroy
	public void end() {
		System.out.println("paying money: destroy");
	}

}
