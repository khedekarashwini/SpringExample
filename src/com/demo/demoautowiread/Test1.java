package com.demo.demoautowiread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans1.xml");
		Student_demo s1=(Student_demo) context.getBean("studdemo");
		s1.test();
		System.out.println("Student name"+s1.getName());
		System.out.println("Student Age"+s1.getAge());

	}

}
