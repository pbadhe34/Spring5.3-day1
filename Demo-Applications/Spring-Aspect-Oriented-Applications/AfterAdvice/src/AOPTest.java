 
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.business.BusinessInterface;

 

 
public class AOPTest {

	 
	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
		System.out.println("\n\n\n");
		BusinessInterface tester=(BusinessInterface) contex.getBean("businessClass"); 
		String result=tester.sayHello("User Data Test");
		System.out.println("\n\n\n");
		System.out.println(result);
	}

}
