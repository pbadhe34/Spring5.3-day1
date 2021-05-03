package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
 
 

@Component(value="MyGroup")
public class Group {
	
	public Group()
	{
		System.out.println("Group.Group()");
	}
   
   @Autowired(required=false)
   private Worker junior;
 
//NO Setter method required to set the handle bean,it is injected as resource

public Worker getJunior() {
	return junior;
}

public void DisplayGroupSalary(){
	System.out.println("Group salary is   "+junior.getSalary("java_whiteCollarWorker") * 10);
}
 
 

 
 

}
