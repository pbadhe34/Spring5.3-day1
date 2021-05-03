import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyBeanConfig;
import com.data.MyBeanClass;

public class ProfileConfigTest {

	public static void main(String[] args) {		 
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		 
		
		//lOad the different bean definitions by setting the active profile
		ctx.getEnvironment().setActiveProfiles("test");	//test/ dev/Production
		
		//ctx.getEnvironment().setDefaultProfiles("dev");
		
		
		//Register  config class
		ctx.register(MyBeanConfig.class);
		 
		ctx.refresh(); 	
		 
	
		MyBeanClass bean =  (MyBeanClass) ctx.getBean(MyBeanClass.class);
		
		bean.display();	
		
		 
		
		
		
		 
           
	}

}
