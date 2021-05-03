
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication
{
   public static void main(String [] args)
   {
      // Read the configuration file
      ApplicationContext ctx  = 
		  new FileSystemXmlApplicationContext("springconfig.xml");

      //Instantiate an object
      IBusinessLogic testObject = (IBusinessLogic)
		  ctx.getBean("businesslogicbean");
	  System.out.println("The object returned by aop container is \n"+ testObject+"\n");



      //Execute the public method of the bean (the testObject)
      testObject.Myfoo();

	  testObject.update();


	  System.out.println("\n");

     //Will the tracing apply here..
	/*  testObject = new BusinessLogic();
	  testObject.Myfoo();*/


   }
}
