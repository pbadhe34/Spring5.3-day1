package com.user;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class RequiredAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the application");
	    ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		 
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
        "Config/beans.xml")); //the xml file is in projects config dir
        */
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
		//the xml file is in projects src dir
		//The default lookup will be projects dir 
		 
		
		
		MyClass bean = (MyClass)factory.getBean("id1");
		bean.getHandle().displayMessage("Hello!!!");
		 
	}

}
