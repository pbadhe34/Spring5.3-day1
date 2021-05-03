 
package com.spring.business;

 
public class BusinessClass implements BusinessInterface {

	@Override
	public String sayHello(String name) {
		/*
		 * if (true) throw new RuntimeException("Error ");
		 */
		return "Hello "+name;
	}
}
