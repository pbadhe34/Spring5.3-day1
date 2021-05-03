package com.app;

import org.springframework.stereotype.Component;

/*The @Component annotation marks a java class as a bean so the component-scanning
mechanism of spring can pick it up and pull it into the application context. 
To use this annotation, apply it over class  
  In additional benefits specifically for DAOs i.e. @Repository annotation.
   The @Repository annotation is a specialization of the @Component annotation
    with similar use and functionality. In addition to importing the DAOs into
     the DI container, it also makes the unchecked exceptions (thrown from DAO methods) 
     eligible for translationinto Spring DataAccessException
     . These annotations are called Stereotype annotations.
     
     Always use these annotations over concrete classes; not over interfaces.
*
*/

/*The @Component stereotype annotation for Spring to
detect the implementation class*/

//denotes a Spring managed component 
@Component(value="myBoss")
public class Manager implements Employee {

	
	public Manager()
	{
		System.out.println("Manager.Manager()");
	}
	public double getSalary(String id) {
		// TODO Auto-generated method stub
		System.out.println("The managers salary..");
		return (id.length() + 10);
	}

	public int sanctionLeave(int days) {
		// TODO Auto-generated method stub
		System.out.println("Employee manager on leave..");
		return days-2;
	}

}
