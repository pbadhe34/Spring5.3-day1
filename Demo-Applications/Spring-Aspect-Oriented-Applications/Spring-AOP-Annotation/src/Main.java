 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.User;


public class Main {

	public static void main(String args[]){
		
		// Laod spring-config.xml file
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring-config.xml");
		((User) ctx.getBean("user")).login();
	}
}
