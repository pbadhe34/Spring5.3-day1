package com.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class User {

	//constructor
	public User(){
		System.out.println("User.User()");
	}
	
	//method login
	public void login(){
		System.out.println("User is trying to login");
	}
}
