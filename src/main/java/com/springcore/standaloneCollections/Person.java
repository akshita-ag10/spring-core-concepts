package com.springcore.standaloneCollections;

import java.util.*;

public class Person {
	
	private List<String> friends;
	private Map<String,Integer> feeStructure;
	private Properties dbPro;
	
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	public Properties getDbPro() {
		return dbPro;
	}
	public void setDbPro(Properties dbPro) {
		this.dbPro = dbPro;
	}
	
	
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", dbPro=" + dbPro + "]";
	}
	
	
	
	
	
	

}
