import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class SecurityAdvice implements MethodBeforeAdvice
//public class SecurityAdvice implements AfterReturningAdvice
{

    private SecurityManager securityManager;

    public SecurityAdvice(SecurityManager mgr)
	{
        this.securityManager = mgr;
    }

    public void  before(Method method, Object[] args, Object target)    throws Throwable 
	{
		System.out.println("\nSecurityAdvice is working...\n");
        UserInfo user = securityManager.getLoggedOnUser();

        if (user == null) 
		{
            System.out.println("No user Login and authenticated");
            throw new SecurityException(
                    "You must login before attempting to invoke the method: "
                            + method.getName());
        } 
		 else if ("Viju".equals(user.getUserName())) {
            System.out.println("Logged in user is Correct - OKAY!");
        } 
		else
			{
            System.out.println("Logged in user is " + user.getUserName()
                    + " NOT GOOD :(");
            throw new SecurityException("User " + user.getUserName()
                    + " is not allowed access to method " + method.getName());
        }

    }

	/*@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("SecurityAdvice.afterReturning()");
		
	}*/
}
