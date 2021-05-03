 

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.User;
 


public class Main {

	public static void main(String args[]){
		
		// Laod spring-config.xml file
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring-config.xml");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		//ctx.register(UserConfig.class);
		 ctx.scan("com.beans");
		 ctx.refresh();	 
		 
		
		//User obj = (User) ctx.getBean("obj");
		User obj =  ctx.getBean(User.class);
	//	System.out.println("The obj is  "+obj.getClass());
		obj.login();
	}
}
