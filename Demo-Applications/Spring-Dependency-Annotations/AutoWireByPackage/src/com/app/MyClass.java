package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
 
//What is the defualt name for this object ?

@Component
public class MyClass {
private int number;
private String name;
private double balance;

 /*AutoWire on Field 'required=false/true' can define dependency check
  * */


//NO Setter method required to set the handle bean,it is injected as resource

   @Autowired(required=true)
   private Handler handle;
 
 public MyClass()
 {
	 System.out.println("MyClass.MyClass()");
 }

   @Autowired(required=false)
   private Group grp;
 
   public void testDirect(){
	   if(grp==null)
	   {
		   System.out.println("Group for myClass is not created...");
		   return;	  
	  }
	  System.out.println("Worker salary is  "+ grp.getJunior().getSalary("JuniorWorker"));
	  grp.DisplayGroupSalary();
	   
   }
 
 
public Handler getHandle() {
	return handle;
}
public int getNumber() {
	return number;
}
public void DisplayName(String name) {
	handle.displayMessage(name);
}

public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
