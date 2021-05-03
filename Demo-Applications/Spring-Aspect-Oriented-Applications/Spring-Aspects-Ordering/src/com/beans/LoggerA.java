package com.beans;

import java.util.Calendar;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*The order value of aspect is declared in xml as
<aop:config>
<aop:aspect id="myAspect1" ref="aBean" order="1">
<aop:aspect id="myAspect2" ref="aBean" order="2">

<aop:pointcut id="businessService"
   expression="execution(* com.xyz.myapp.service.*.*(..))"/>
...
</aop:aspect>
</aop:config>*/

/*
 * On the way in to a joinpoint, the advice with lowest Order value gets executed first.
  On the way out from the joinpoint, the advice with highest Order value gets executed first.
*/

@Component
@Aspect
@Order(1)
public class LoggerA {
	
	public LoggerA()
	{
		System.out.println("LoggerAA.Logger()");
	}
	
	@After("execution(* com.beans.User.login(..))")
	public void log(){
		System.out.println("After user  has logged in Logger1 @"+Calendar.getInstance().getTime());
	}
}
