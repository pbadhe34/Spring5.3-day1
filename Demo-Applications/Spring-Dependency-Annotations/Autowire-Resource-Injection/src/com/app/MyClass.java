package com.app;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
 

public class MyClass {
private int number;
private String name;
private double balance;

 
    public MyClass()
    {
 	   System.out.println("MyClass default constructor");
 	   handleBean = null;
    }
    
    
      /*
       * AutoWire on Field 'required=false/true'  defines dependency check
     * */

      //The defualt autowiure required is true
       //Autowire by type in abesnce of setter method\
    
		
		/*
		 * @Autowired(required=true) private Handler handleBean;
		 */
		 
       
    
    /* Auto wire by setter method
     * @Autowired can be defined on any on any method to set the bean property
     * */
     
	/*
	 * private Handler handleBean;
	 * 
	 * @Autowired(required=false) public void AddHandle(@Qualifier(value =
	 * "handleBean") Handler handle) { System.out.println("MyClass.AddHandle()");
	 * this.handleBean = handle; }
	 */
    
    //Auto wire by constructor
    
  	
      private Handler handleBean;
  	  @Autowired(required=true) 
  	  public MyClass(@Qualifier(value = "HandlerBeanType") Handler obj) {
  	  System.out.println("MyClass Autowire by constructor"); 
  	  handleBean = obj;
  	  }
  	 
      
        //The resource injection by Name
    
	
		/*
		 * //NO Setter method required to set the handle bean,it is injected as resource
		 * 
		 * @Resource(name="resourceInjectionBean") private Handler handleBean;
		 */
    
 
   


public int getNumber() {
	return number;
}
public void DisplayName(String name) {
	handleBean.displayMessage(name);
}


public void DisplayResourceData(String name) {
	handleBean.displayMessage(name);
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
