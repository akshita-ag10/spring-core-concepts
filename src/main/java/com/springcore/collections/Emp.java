package com.springcore.collections;

import java.util.*;

public class Emp {
	
	private int empId;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties about;
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getAbout() {
		return about;
	}
	public void setAbout(Properties about) {
		this.about = about;
	}
	
	
	
	public Emp(int empId, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties about) {
		super();
		this.empId = empId;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.about = about;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", about=" + about + "]";
	}
	
	

}
