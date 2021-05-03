package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class TestPropertyInjection {

	/**
	 * @param args
	 */
	 public static void main(String[] args)
		{
	         
			BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
	                "config.xml"));

	        MyClass cc = (MyClass) 
				factory.getBean("obj1");
	        System.out.println("Obj1 someValue injected is "+cc.getSomeValue());
	        System.out.println("Obj1 data injected value is "+cc.getData());
			MyClass cc2 = (MyClass) factory.getBean("obj2");
			 System.out.println("Obj2 someValue injected is "+cc.getSomeValue());
		     System.out.println("Obj2 data injected value is "+cc.getData());
			 
			int balance = cc2.checkBalance();
			 System.out.println("Obj2 balance calclated from dependencies  is "+balance);

			 
	    }
}
