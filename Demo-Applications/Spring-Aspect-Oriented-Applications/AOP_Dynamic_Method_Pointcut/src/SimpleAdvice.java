import java.lang.reflect.Method;

 

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class SimpleAdvice implements MethodInterceptor {

	 
		  public Object invoke(MethodInvocation invocation) throws Throwable {
			 Integer intVal =  (Integer) invocation.getArguments()[0];
			 
		    System.out.println("\n**SimpleAdivce.Invoking " + invocation.getMethod().getName()+
		    		"  with argument as  "+intVal);
		    Object retVal = invocation.proceed();
		    System.out.println("\n**SimpleAdvice.Done for "+invocation.getMethod().getName());
		    return retVal;
		  }

		 
		}

