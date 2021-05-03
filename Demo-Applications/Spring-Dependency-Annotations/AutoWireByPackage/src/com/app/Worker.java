package com.app;

import org.springframework.stereotype.Component;

@Component
public class Worker  {
	
	public Worker()
	{
		System.out.println("Worker.Worker()");
	}

	public double getSalary(String id) {
		// TODO Auto-generated method stub
		System.out.println("Worker's salary..");
		return (id.length() - 5);
	}

	public int sanctionLeave(int days) {
		// TODO Auto-generated method stub
		System.out.println("Employee Worker on leave..");
		return days +14;
	}

}
