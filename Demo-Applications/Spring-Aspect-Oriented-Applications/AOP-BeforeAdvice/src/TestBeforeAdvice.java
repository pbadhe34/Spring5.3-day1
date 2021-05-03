import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeAdvice
{

     static SecurityManager mgr = new SecurityManager();
        
    public static void main(String[] args) {
        // get the security manager
        
        // get the bean
       // SecureBean bean = getSecureBean();

		//System.out.println("The proxy object is  "+bean);


		//SecureBean bean = new   SecureBean(); 
    	SecureBean bean = new SecureBean();
        
     // create the target
        SecureBean target = new SecureBean();

        // create the advice
        SecurityAdvice advice = new SecurityAdvice(mgr);
        
        // get the proxy
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);
        SecureBean proxy = (SecureBean)factory.getProxy();       

        // try as Viju/Sunil
        mgr.login("Viju", "pwd");
        
        proxy.writeSecureMessage();
        
        mgr.logout();
        
        // try as janm
		 
        try 
		{
            mgr.login("janm", "pwd");
            proxy.writeSecureMessage();
        } 
		catch(SecurityException ex)
		{
            System.out.println("Exception Caught for invaliid  login: " + ex.getMessage());
        } 
		finally 
		{
            mgr.logout();
        }
        
        // try with no credentials
        try
		{
        	proxy.writeSecureMessage();
        } 
		catch(SecurityException ex) 
		{
            System.out.println("Exception Caught without login : " + ex.getMessage());
        }
		 

    }
    
    private static SecureBean getSecureBean() 
	{
        // create the target
        SecureBean target = new SecureBean();

        // create the advice
        SecurityAdvice advice = new SecurityAdvice(mgr);
        
        // get the proxy
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);
        SecureBean proxy = (SecureBean)factory.getProxy();
        
        return proxy;
        
    }
}

