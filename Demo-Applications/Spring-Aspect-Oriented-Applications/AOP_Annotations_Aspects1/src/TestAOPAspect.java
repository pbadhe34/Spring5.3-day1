

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.server.User;

public class TestAOPAspect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the application");
	    ApplicationContext factory = new ClassPathXmlApplicationContext("aop.xml");
		 
				
		User bean = (User)factory.getBean("myBean");
		bean.plunder();
		
		bean.update();

	}

}
