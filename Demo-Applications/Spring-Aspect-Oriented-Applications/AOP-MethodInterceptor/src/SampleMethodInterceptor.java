 

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

 //MethodInterceptor Around Advice class
public class SampleMethodInterceptor implements MethodInterceptor
{
  private final static Log log = LogFactory.getLog(SampleMethodInterceptor.class);
  private boolean enableCall= false;
  
  public void setEnableCall(boolean flag)
	{
	   enableCall = flag;
	} 
   
   //The actual invoke method that intercepts  
   
  public Object invoke(MethodInvocation invocation) throws Throwable
  {
     log.info("BEGINNING:" + invocation);
	 Object object = null;
	 System.out.println("Beginnning the call ");
     
    //if (invocation.getArguments() != null && invocation.getArguments().length > 0)
    {
      
       //log.info("Arguments number  :" + invocation.getArguments().length); 
      
	   if(enableCall)
		{
		   object= invocation.proceed();
		   System.out.println("Return value from  mehod call is  "+object);
		}

	   else
		{
           System.out.println("Your mehod call is not allowed for  "+invocation);
		}
    }
    if(log.isDebugEnabled())
      log.debug("print dedbug message  ");  
	
	  log.info("ENDING:" + invocation);     
      return object;      
     
  }
}