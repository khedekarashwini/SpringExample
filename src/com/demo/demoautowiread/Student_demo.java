package com.demo.demoautowiread;

import org.springframework.beans.factory.annotation.Autowired;

public class Student_demo {
	private String name;
	private int age;
	Teacher_demo teach;
	
	@Autowired

	public Student_demo(Teacher_demo teach) {
		super();
		System.out.println("Inside student constructor");
         this.teach = teach;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher_demo getTeach() {
		return teach;
	}
	
	public void setTeach(Teacher_demo teach) {
		this.teach = teach;
	}
	public void test()
	{
		teach.testinautowire();
	}
	

}
