package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/*The @Service annotation is also a specialization of the component annotation. 
It doesn’t currently provide any additional behavior over the @Component annotation,
but it’s a good idea to use @Service over @Component in service-layer classes because 
it specifies intent better.  
*/
@Service("myFactory")
public class PuneFactory {
	
	public PuneFactory()
	{
		System.out.println("PuneFactory.construcor()");
	}
	
Employee emp;

 
public Employee getEmp() {
	System.out.println("PuneFactory.getEmp()");
	return emp;
}
@Autowired 
public void setEmp(Employee emp) {
//public void setEmp(@Qualifier("myBoy")Employee emp) {
	System.out.println("PuneFactory.setEmp()");
	this.emp = emp;
}

}
