package com.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

					// if you do not give the obj name here, it will take class name in camelCase, 
				   //so then you have to pass "student" in context.getBean("student"), 
@Component("stu1") //but now since name of obj to be formed is specified -context.getBean("stu1");
public class Student {
	
	@Value("Akshita")
	private String studentName;
	@Value("20")
	private String Age;
					//to specify collection type, make the util list in config.xml and provide the id here
	@Value("#{stuAddress}")
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
