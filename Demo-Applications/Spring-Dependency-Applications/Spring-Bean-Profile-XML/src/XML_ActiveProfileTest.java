import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import com.server.MyBeanClass;

 

public class XML_ActiveProfileTest {

	public static void main(String[] args) {	
		
		//command line args to set the profile:	-Dspring.profiles.active="dev"
				
		//System.setProperty("spring.profiles.active", "dev");
		
		//To load multiple xml bean definitions
		/*GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	    ConfigurableEnvironment env = ctx.getEnvironment();
	    env.setActiveProfiles("prod"); //user1 test dev prod user2
	    ctx.load("profile1.xml","profile2.xml","profile3.xml");
	    ctx.refresh();*/
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Profile3.xml");		
		ConfigurableEnvironment env = ctx.getEnvironment();
	    env.setActiveProfiles("test");  //test dev prod
	    ctx.refresh(); 
        
		
		int count = ctx.getBeanDefinitionCount();
		System.out.println("The beans count defined is  "+count);
		
		
		String beans[] = ctx.getBeanDefinitionNames();
		
		System.out.println("The beans defined are  "+beans.length);
		
		
	   String profiles[]=ctx.getEnvironment().getActiveProfiles();
	   System.out.println("The profiles active are  "+profiles[0]);
	
		MyBeanClass bean =  (MyBeanClass) ctx.getBean("id1");
		
		bean.display();	
		
		 
		
		
		
		 
           
	}

}
