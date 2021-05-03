import org.data.EmployeeController;
import org.server.MyConfig;
import org.server.UserConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.magic.MagicBean;
import com.magic.MagicConfig;
import com.server.MyBeanClass;

public class JavaConfigTest {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//set the system property to enable the conditional bean declaration
		//in application context
		
		//System.setProperty("magicData","MY MAGIC BYTE") ;	 
		
		/*ctx.addBeanFactoryPostProcessor(new BeanFactoryPostProcessor() {
			
			@Override
			public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
				System.out.println("JavaConfigTest.BeanFactoryPostProcessor()");
				factory.addBeanPostProcessor(new CustomBeanPostProcessor());			
				
			}
		});*/
		
		/*ctx.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
			@Override
			public void onApplicationEvent(ApplicationEvent arg0) {
				System.out.println("JavaConfigTest.onApplicationEvent()" +arg0.getTimestamp());
				
			}
		});*/
				
		  
		//Register multiple config classes
		ctx.register(MyConfig.class, UserConfig.class);
		ctx.register(MagicConfig.class);
		
		ctx.refresh();

   
	
		MyBeanClass bean =  (MyBeanClass) ctx.getBean("BabaBean");
		
		bean.display();
       
          //ctx.getBean(MyBeanClass.class);
		
		/*System.out.println("\nTesting the respoisitory annoation by scanning the base package\n");
		
		ctx.scan("org.data");  //scan for annoations in packages
		
		EmployeeController controller = (EmployeeController) ctx.getBean("employeeController");
		
		System.out.println(controller.createNewEmployee());
		
		*/
	     
		
		
		 
		/*//Test conditional bean existance
		
		System.out.println("\n");
		if(ctx.containsBean("My Magic Bean"))
		{
		  MagicBean bean1 = (MagicBean) ctx.getBean("My Magic Bean");
		  bean1.update();
		}
		else
			System.out.println("\nThe MagicBean is not registered\n");*/
		
		ctx.registerShutdownHook();
	}

}
