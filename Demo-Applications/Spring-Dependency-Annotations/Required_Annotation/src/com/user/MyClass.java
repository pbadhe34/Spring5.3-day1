package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class MyClass {
private int number;
private String name;
private double balance;


Handler handle;

 
/*
 * The '@Required' annotation is equivalent to addding 'dependency-check' 
 * for the bean definitions in bean xml file
 */
		
@Required
public void setHandle(Handler handle) {
	this.handle = handle;
}

 
public int getNumber() {
	return number;
}
public Handler getHandle() {
	return handle;
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
