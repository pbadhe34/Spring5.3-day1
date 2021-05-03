package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.CustomerBo;

 

public class AppAOPTest {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Aop.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customer");
		customer.addCustomer();
		
		customer.addCustomerReturnValue();	
		
		
		customer.addCustomerAround("Asoka");
		
		customer.addCustomerThrowException();

	}
}