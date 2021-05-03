import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class SimpleAfterReturningAdvice implements 
AfterReturningAdvice 
{


//Method specified by AfterReturningAdvice interface
	 public void afterReturning(Object returnValue, Method method, Object[] args,
            Object target) throws Throwable 
	 {
        System.out.println("");
        System.out.println("Result After method: " + method.getName());
		System.out.println("Object return is "+returnValue);
		System.out.println("Object target is "+target);
		System.out.println("Object args is "+(String)args[0]);
     }

     

   
}           
       