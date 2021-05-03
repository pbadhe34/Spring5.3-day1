package com.server;

 

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class Singer {
@Pointcut("execution(* User.plunder(..))")
public void plunderJob() {
	/*This  annotation-based aspect has a pointcut that is triggered by the execution of
	a plunder() method on the User class. */
	
	System.out.println("Singer.plunderJob()");
	
}

@Before("plunder()")
public void singSong() {
	
/*Before the User.plunder() method is executed,singSong is called.
*/	
	System.out.println("Singer.singSong()");
 
}
@AfterReturning("plunder()")
public void singForMe() {
 
	/*After the User.plunder() method returns successfully
	the singForMe() method is invoked*/
	System.out.println("Singer.singForMe()");
}
}