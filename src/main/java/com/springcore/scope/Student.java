package com.springcore.scope;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu1")
//@Scope("singleton") //(no need to specify singleton b/c bydefault it is singleton scope only, 
					  //i.e. only 1 obj will be created for a bean, 
					  //& this same obj will be returned for every getBean() call
public class Student {
	
	@Value("Akshita")
	private String studentName;
	@Value("20")
	private String Age;
					
	@Value("#{stuAddress}") //this # one is Expression Language, it supports 2 things - parsing & executing expressions at runtime
	private List<String> addresses;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", Age=" + Age + ", addresses=" + addresses + "]";
	}
	
	
	
	
	

}
