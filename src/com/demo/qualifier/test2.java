package com.demo.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans2.xml");
	  Salary s1=(Salary) context.getBean("salary");
	  Employee e1= (Employee) context.getBean("empdemo");
	 
	  s1.checksalary();
	  
	 System.out.println(e1.getName());
	 System.out.println(e1.getAge());
	  
	}

}
