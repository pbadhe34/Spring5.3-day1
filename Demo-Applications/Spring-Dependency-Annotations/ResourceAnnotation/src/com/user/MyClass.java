package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import javax.annotation.Resource;

public class MyClass {
private int number;
private String name;
private double balance;

/*
 * For using @Resource annotation the part bean of parent bean must be
 * defined as unique of that type,No multiple beans of same types should be defined
 * in bean xml config file.
 */
/*
 * If you have multiple beans of same type defined in xml then you can pass
 * the 'id' atribute to Resource attribute 'name' value.
 */
//@Resource(name = "HandlerBean" ,mappedName="Bean Name", type=com.user.Handler.class, shareable=true, description="Handler Resource" )
//@Resource(name = "HandlerBean")
@Resource
private Handler handle;
 
//NO Setter method required to set the handle bean,it is injected as resource
 
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
