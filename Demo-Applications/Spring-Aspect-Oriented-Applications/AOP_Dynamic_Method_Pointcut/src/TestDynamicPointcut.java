

	import org.aopalliance.intercept.MethodInterceptor;
	import org.aopalliance.intercept.MethodInvocation;
	import org.springframework.aop.Advisor;
	import org.springframework.aop.ClassFilter;
	import org.springframework.aop.framework.ProxyFactory;
	import org.springframework.aop.support.DefaultPointcutAdvisor;
	import org.springframework.aop.support.DynamicMethodMatcherPointcut;

	public class TestDynamicPointcut {

	  public static void main(String[] args) {
	    MyClass target = new MyClass();

	    Advisor advisor = new DefaultPointcutAdvisor
	    (new DynamicPointcut(), new SimpleAdvice());

	    ProxyFactory pf = new ProxyFactory();
	    pf.setTarget(target);
	    pf.addAdvisor(advisor);
	    MyClass proxy = (MyClass) pf.getProxy();

	    proxy.work(12);
	    proxy.work(56);
	    
	    proxy.work("US_HR");
	    
	    double income = proxy.getSalary();
	    System.out.println("The user salary is  "+income);

	  }
	}
