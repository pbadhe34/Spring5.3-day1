

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.data.Handler;
import com.data.MyClass;
 
@Configuration 
public class MyConfig {
	
	   @Bean(name="appBean") 	   
	   public MyClass getMyClassBeanObject(){
		   System.out.println("\n***MyConfig.getMyClassBeanObject()");
		   MyClass bean = new MyClass();
		   bean.setName("MyClass Parent bean");
	       return bean;
	   }

	   @Bean(name="MyBean") 
	   @Scope("prototype")
	   public Handler getAnotherHandlerBeanObject(){
		   System.out.println("\n***MyConfig.getAnotherHandlerBeanObject()");
		   Handler bean = new Handler();
		   bean.setName("The  Prototype Bean Handler");
	       return bean;
	   }
	   
	   @Bean(name="MyChoiceBean") 
	   @Scope("singleton")
	   public Handler getHandlerBeanObject(){
		   System.out.println("\n**MyConfig.getHandlerBeanObject()");
		   Handler bean = new Handler();
		   bean.setName("Me Handler");
	       return bean;
	   }

}
