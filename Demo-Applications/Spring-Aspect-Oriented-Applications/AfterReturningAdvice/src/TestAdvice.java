import org.springframework.aop.framework.ProxyFactory;


public class TestAdvice {
	public static void main(String[] args) 
	{
        MessageWriter target = new MessageWriter();

		target.data="Here";

        // create the proxy
        ProxyFactory pf = new ProxyFactory();

        //Add the advice and set the target object
        pf.addAdvice(new SimpleAfterReturningAdvice());
        pf.setTarget(target);
       // pf.setTarget(new Account());

        MessageWriter proxy = (MessageWriter) pf.getProxy();
        
        System.out.println("The real object is  "+target);
        
      
       // Account proxy2 = (Account) pf.getProxy();    
        

        // write the messages
       proxy.writeMessage("My Data Message to be printed");
       
      // System.out.println("The proxy object is  "+proxy);

		//target.writeMessage("My Message");
    }
}
