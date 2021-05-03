

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.MyClass;
import com.app.PuneFactory;

public class AutoWireAnnotationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the application");
	    ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		 
		
	    PuneFactory facPune = (PuneFactory)factory.getBean("myFactory");
	    System.out.println("The Employee Factory is  "+facPune);
	   
	    System.out.println(facPune.getEmp().getSalary("Vikram"));
	    System.out.println(facPune.getEmp().sanctionLeave(14));  
	    
	    //test another component	    
	    MyClass testMe = (MyClass)factory.getBean("myClass");//default name for MyClass object
	    testMe.getHandle().displayMessage("Welcome...");
	    
	    //test group components without annotations 
	    testMe.testDirect();
	   
	    
	    	 
	    }

	 

}
