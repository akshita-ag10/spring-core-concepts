package com.springcore.constInject;

import java.util.*;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<Integer> phoneNos;
	public Person(String name, int personId, Certi certi, List<Integer> phoneNos) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.phoneNos = phoneNos;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", phoneNos=" + phoneNos + "]";
	}
	
	
	
}
