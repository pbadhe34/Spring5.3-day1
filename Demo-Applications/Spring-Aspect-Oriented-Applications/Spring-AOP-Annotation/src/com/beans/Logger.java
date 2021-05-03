package com.beans;

import java.util.Calendar;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logger {
	
	@After("execution(* com.beans.User.login(..))")
	public void log(){
		System.out.println("user has logged in @"+Calendar.getInstance().getTime());
	}
}
