package com.app;

import org.springframework.stereotype.Component;

/*The @Component stereotype annotation for Spring to
detect the implementation class*/

//denotes a Spring managed component 
//@Component(value="myBoy")
public class Assistant implements Employee {
	
	public Assistant()
	{
		System.out.println("Assistant.Assistant()");
	}

	public double getSalary(String id) {
		// TODO Auto-generated method stub
		System.out.println("Assistant's salary..");
		return (id.length() - 10);
	}

	public int sanctionLeave(int days) {
		// TODO Auto-generated method stub
		System.out.println("Employee Assistant on leave..");
		return days +4;
	}

}
