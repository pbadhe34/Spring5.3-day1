package com.user;

public class Handler {
	private String name;
	 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
 public void displayMessage(String message){
	 System.out.println(message +" from  "+name); 
 }
}
