


	import java.lang.reflect.Method;

	import org.springframework.aop.Advisor;
	import org.springframework.aop.ClassFilter;
	import org.springframework.aop.MethodBeforeAdvice;
	import org.springframework.aop.framework.ProxyFactory;
	import org.springframework.aop.support.ComposablePointcut;
	import org.springframework.aop.support.DefaultPointcutAdvisor;
	import org.springframework.aop.support.StaticMethodMatcher;

	public class Test_Static_PointCut {
	  public static void main(String[] args) {
	    SimpleBean target1 = new SimpleBean();
	     UserAdmin target2 = new UserAdmin();
	     

	    //Pointcut is predicate
	    //ComposablePointcut pc = new ComposablePointcut(ClassFilter.TRUE, new StatiicMethodMatcher());
	    ComposablePointcut pc = new ComposablePointcut
	    (new MyClassFilter(), new StatiicMethodMatcher());
	    //The adviusor groups the Pointcut and advice
	    Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleBeforeAdvice());

	    ProxyFactory pf = new ProxyFactory();
	    pf.setTarget(target1);
	   
	    pf.addAdvisor(advisor);	    

	   // pc.intersection(new StatiicMethodMatcher());
	    
	    SimpleBean proxy = (SimpleBean) pf.getProxy();
	    
	    proxy.setName("Chanakya");
		proxy.setAge(45);
	    int age = proxy.getAge();
	    String name = proxy.getName();
	    System.out.println("The name is  "+name);
	    System.out.println("The age is  "+age);
	    
	    System.out.println("**************");
	    
	    pf.setTarget(target2);
	    
	    UserAdmin proxy2 = (UserAdmin) pf.getProxy();
	    proxy2.setPermissions(156);
	    double value = proxy2.getUserAverage();
	    
	    
	    
	  }

	   

	   
	}
