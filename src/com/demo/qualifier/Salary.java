package com.demo.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Salary {
 // @Autowired
  @Qualifier("empdemo")
	private Employee e1;
	public Salary()
   {
	   System.out.println("Inside salary constructor");
	}
	public void getage()
	{
		System.out.println("age of emp...");
	}
	public void getname()
	{
		System.out.println("name of emp....");
	}
	public void checksalary()
	{
		System.out.println("salary= 65000");
	}
   
}
