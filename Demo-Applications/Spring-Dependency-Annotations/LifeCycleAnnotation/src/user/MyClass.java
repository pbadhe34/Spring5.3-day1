package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 

public class MyClass {
private int number;
private String name;
private double balance;

 
  
public Handler getHandle() {
	return handle;
}

private Handler handle;

 //@Autowired on any method to set/inject the part 
 
@Autowired(required=true)
public void Add(@Qualifier("HandlerOne")Handler handle) {
	System.out.println("Handler set for MyClass ..");
	this.handle = handle;
	}

//Life cycle methods
@PostConstruct
public void checkHandler(){
	System.out.println("The Handler is in init method");
	if(handle==null){
		System.out.println("The Handler is not inited so creating here");
		handle= new Handler();
	    handle.setName("Goa");
		
	}
}
@PreDestroy
public void ClearData(){
	name=null;
	System.out.println("The Handler for MyClass closing here before destroying");
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
