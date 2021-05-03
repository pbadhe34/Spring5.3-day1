package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Qualifier;
 

public class MyClass {
private Integer number;
private String name;
private double balance; 

    
   private Handler handle;
  //You can have only one of the constructor marked with autoWire annotation
 //@Autowired on constructor to set/inject the part Bean into parent bean
 
/*@Autowired(required=false)
public  MyClass(@Qualifier("HandlerBean")Handler handler) {
	System.out.println("Handler set for MyClass Qualifier first Constructor..");
	this.handle = handler;
	}
*/
@Autowired(required=true)
public  MyClass(Handler handler) {
	System.out.println("Handler set in MyClass first Constructor..");
	this.handle = handler;
	}

//@Autowired(required=true)
public  MyClass(Integer data,Handler handler) {
	System.out.println("Handler set in  MyClass second Constructor..");
	number = data;
	this.handle = handler;
	}


//@Autowired Autowiring not supported on default constructor!
public  MyClass() {
	System.out.println("The MyClass Default Constructor..");	
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
