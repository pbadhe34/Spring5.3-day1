 
package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

 
@Aspect
public class LogginAspectAnnotationDriven {
	
	//@After("execution(public * *(..))")
	@AfterReturning("execution(public * *(..))")
	public void afterAdvice(JoinPoint jp){
		System.out.println("\nAnnotation driven:After executing "+jp.getSignature().getName()+"()");
	}
}
