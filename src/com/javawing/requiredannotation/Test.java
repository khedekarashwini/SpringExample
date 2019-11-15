package com.javawing.requiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		DemoEmployee e1=(DemoEmployee) context.getBean("empdemo");
		System.out.println("Emp name......."+e1.getName());
		System.out.println("Emp age..........."+e1.getAge());

	}

}
