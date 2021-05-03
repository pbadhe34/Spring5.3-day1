 

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class ShowSamples
{
  public static void main(String[] args) throws InterruptedException
  {
    ApplicationContext context = 
		new ClassPathXmlApplicationContext("/sample-config.xml");
    
    SampleInterface sampleRaw = 
		(SampleInterface)context.getBean("sampleInterfaceImpl");
    SampleInterface sampleWithInterceptor = 
		(SampleInterface)context.getBean("sampleInterfaceWithInterceptor");

     
      Date rawDate = sampleRaw.getCurrentDate();  

	  System.out.println("The date with sampleRaw is  "+rawDate);
 
      Date interceptedDate = sampleWithInterceptor.getCurrentDate();

	  sampleWithInterceptor.printMessage("Is Interceptor enabled ?....no");
       
  }
  
}
