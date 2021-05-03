import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcher;


public class StatiicMethodMatcher extends StaticMethodMatcher {
	 

		  public boolean matches(Method method, Class cls) {
			  String methodName = method.getName();
			  boolean flag = methodName.startsWith("get");
		    return flag;
		  }
		}