package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the application");
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		
		//ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		     
		
		MyClass bean = (MyClass)factory.getBean("id1");
		bean.DisplayName("Kaka Lever!!!");
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) factory;
		//ctx.close();
		
		ctx.registerShutdownHook();
	 

	}

}
