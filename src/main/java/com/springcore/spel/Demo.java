package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{11+2}")
	private int x;
	
	@Value("#{8>6? 88: 66}")
	private int y;
	
	//Passing static method of inbuilt or self made classes
	//FORMAT = T(class).method(param)
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;
	
	//Passing static variable of self-made or inbuilt classes
	//FORMAT = T(class).variable
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	//NOT DEPENDENCY INJECTION - b/c methods are variables of the class are not being injected, only the value of that class object is being passed
	//Passing value of object of inbuilt or self-made (like Student) class
	@Value("#{new java.lang.String('Akshita Agg')}")  // or "#{new String('Akshita')}"
	private String name;					//@Value("Akshita") //since the class is String it can be passed directly
	

	//@Value("1") //or @Value("false") 
	//using expressions
	@Value("#{8-6<5}")
	private boolean isActive;

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	public double getPi() {
		return pi;
	}


	public void setPi(double pi) {
		this.pi = pi;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}


	


	
	
	
	
	
	

}
