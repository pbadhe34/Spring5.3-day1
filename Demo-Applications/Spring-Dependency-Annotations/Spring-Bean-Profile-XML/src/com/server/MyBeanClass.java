
package com.server;


public class MyBeanClass {

	public MyBeanClass()
	{
		System.out.println("MyBeanClass.MyBeanClass()");
	}
	
	private String name;
	
	public void setName(String newname)
	{
		System.out.println("MyBeanClass.setName()");
		name = newname;
		
	}
	public void verifyInit()
	{
		System.out.println("verifying the Name init value");
	}
	
	public void clearName()
	{
		System.out.println("MyBeanClass.clearName() for closing");
	}
	
	public void display()
	{
		System.out.println("The bean name is  "+name);
	}
}
