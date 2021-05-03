import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class SimpleBeforeAdvice implements MethodBeforeAdvice {
	 
		  public void before(Method method, Object[] args, Object target) throws Throwable {
		    System.out.println("\n**Before method " + method.getName()+"**\n");
		  }
		}
