
import org.app.MagicConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.data.MyClass;

 
public class JavaAnnotationTest {

	public static void main(String[] args) {
	 	
		
		
		  AnnotationConfigApplicationContext ctx = new
		  AnnotationConfigApplicationContext(MyConfig.class);
		  
		  MyClass bean = (MyClass) ctx.getBean("appBean");
		  
		  bean.DisplayName("Hi this is from annotated bean without XML!");
		 
       
        		
		/*
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext();
		 * 
		 * //set the system property to enable the conditional bean declaration //in
		 * application context
		 * 
		 * System.setProperty("magicData","App-Test") ; //Register multiple config
		 * classes //ctx.register(MyConfig.class); ctx.register(MyConfig.class,
		 * MagicConfig.class); ctx.refresh();
		 * 
		 * MyClass bean = (MyClass) ctx.getBean("appBean");
		 * 
		 * bean.DisplayName("\n$$Really.. this is from annotated bean without XML!");
		 * 
		 * MyClass bean2 = (MyClass) ctx.getBean("conditionalBean");
		 * 
		 * bean2.DisplayName("\n$$How hot it is  here Without COOL XML!");
		 */	 
		 
		
		  ctx.registerShutdownHook();
	}

}
