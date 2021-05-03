package com.customer.impl;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.customer.CustomerBo;

 
@Configuration
@EnableAspectJAutoProxy
public class MyCustomer implements CustomerBo {

	public void addCustomer(){
		System.out.println("MyCustomer addCustomer() is running ");
	}
	
	public String addCustomerReturnValue(){
		System.out.println("MyCustomer addCustomerReturnValue() is running ");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("MyCustomer addCustomerThrowException() is running ");
		 //throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		System.out.println("MyCustomer addCustomerAround() is running, args : " + name);
	}
}