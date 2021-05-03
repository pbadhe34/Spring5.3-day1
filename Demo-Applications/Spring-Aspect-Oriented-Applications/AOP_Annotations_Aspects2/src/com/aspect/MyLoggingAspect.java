package com.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

	@Before("execution(* com.customer.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("MyLoggingAspect logBefore() is running!");
		System.out.println("MyLoggingAspect has hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

	@After("execution(* com.customer.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("MyLoggingAspect logAfter() is running!");
		System.out.println("MyLoggingAspect has hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}
	
	@AfterReturning(
			pointcut = "execution(* com.customer.CustomerBo.addCustomerReturnValue(..))",
			returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("MyLoggingAspect logAfterReturning() is running!");
		System.out.println("MyLoggingAspect hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");

	}
	
	/*@AfterThrowing(
			pointcut = "execution(* com.customer.CustomerBo.addCustomerThrowException(..))",
			throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");

	}*/
	
	
	@Around("execution(* com.customer.CustomerBo.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("MyLoggingAspect logAround() is running!");
		System.out.println("MyLoggingAspect has hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("The hijacked arguments in MyLoggingAspect   : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("MyLoggingAspect Around before is running!");
		joinPoint.proceed();
		System.out.println("MyLoggingAspect Around after is running!");
		
		System.out.println("******");

	}
	
}