package com.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceAnnotationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the application");
	    ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		 
		
		
		MyClass bean = (MyClass)factory.getBean("id1");
		bean.DisplayName("Johnny English!!!");

	}

}
