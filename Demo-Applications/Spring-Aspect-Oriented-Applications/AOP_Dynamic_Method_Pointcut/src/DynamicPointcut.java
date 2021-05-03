import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;


public class DynamicPointcut extends DynamicMethodMatcherPointcut {

	  public boolean matches(Method method, Class cls) {
		  System.out.println("The class name is  "+cls.getName());
	    return ("work".equals(method.getName()));
	  }

	  public boolean matches(Method method, Class cls, Object[] args) {
		  System.out.println("Argument type in method is  "+args[0].getClass().getSimpleName());
		  if(args[0].getClass().getSimpleName().equals("String"))
			  return false;
		  
	    int x = (Integer) args[0];
	    boolean flag = (x != 0);
	    return flag;
	  }

	  public ClassFilter getClassFilter() {
	    return new ClassFilter() {
	      public boolean matches(Class cls) {
	        return (cls == MyClass.class);
	      }
	    };
	  }
	}

 
