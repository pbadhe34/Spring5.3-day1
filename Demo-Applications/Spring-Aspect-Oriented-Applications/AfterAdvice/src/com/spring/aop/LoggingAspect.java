 
package com.spring.aop;

import org.aspectj.lang.JoinPoint;
 
public class LoggingAspect {
	public void log(JoinPoint jp) throws Throwable {
		System.out.println("\nXML Configuration driven: After executing "+jp.getSignature().getName()+"()");
	}
}
