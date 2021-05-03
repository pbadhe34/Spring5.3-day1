import org.springframework.aop.ClassFilter;


public class MyClassFilter implements ClassFilter {

	public boolean matches(Class<?> arg) {
		System.out.println("MyClassFilter.matches() invoked here..");		
	
		String className = arg.getSimpleName();
		System.out.println("The class name is  "+className);
		if(className.equals("SimpleBean"))
			return true;
		else
			return false;
	}

}
