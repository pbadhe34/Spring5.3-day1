package com.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Qualifier;
 

public class MyClass {
private int number;
private String name;
private double balance;

 /*
  * In case of multiple declarations of same type if beans autowire by name/id defined 
  * with @Qualifier attribute 
  */
 

   /*@Autowired(required=true)
   @Qualifier("HandlerOne")
   private Handler handle;
 */
//NO Setter method required to set the handle bean,it is injected as resource


 
public Handler getHandle() {
	return handle;
}

private Handler handle;

 //@Autowired on any method to set/inject the part 
 
@Autowired(required=false)//qualify for injection by id
public void Add(@Qualifier("MyChoiceBean")Handler handle) {
	System.out.println("Handler set for MyClass ..");
	this.handle = handle;
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
