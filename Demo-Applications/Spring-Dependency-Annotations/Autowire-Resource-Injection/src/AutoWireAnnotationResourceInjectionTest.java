

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.MyClass;

public class AutoWireAnnotationResourceInjectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the application");
	    ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");		
		
		MyClass bean = (MyClass)factory.getBean("id1"); 
	 
		bean.DisplayName("Johnny Dcosta!!!");
		
		bean.DisplayResourceData("Kayamat Ali!");
		
		 

	}

}
