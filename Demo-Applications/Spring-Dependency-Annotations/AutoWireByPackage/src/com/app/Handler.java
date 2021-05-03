package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Handler {
	private String name;
	
	/*public Handler(){
		System.out.println("Handler Default Constructor!");
		name="baba";
	}*/
	
	@Autowired(required=false)  ////The string bean must be available
	public Handler(String id){
		System.out.println("Handler Param Constructor!");
		name=id;
	}
	 
 public String getName() {
		return name;
	}
 //For this alone setter to work the default constructor must be defined!
 @Autowired(required=false)//The string bean may not be available
	public void setName(String name) {
		this.name = name;
	}
public void displayMessage(String message){
	 System.out.println(message + "from  "+name); 
 }
}
