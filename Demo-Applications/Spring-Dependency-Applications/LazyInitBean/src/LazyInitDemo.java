import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LazyInitDemo
{

    public static void main(String[] args)throws Exception
	{
    	System.out.println("Initializing the  bean factory...");	 
    	
		/*
		 * ConfigurableListableBeanFactory factory = new XmlBeanFactory( new
		 * FileSystemResource("beans.xml"));
		 */       
      
    	
		/*
		 * BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
		 * "beans.xml"));
		 */
    	
    	 //ApplicationContext is implemented by ClassPathXmlApplicationContext
    	 //ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
    	
    	 ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
       
		 Thread.sleep(1000);
		
		 
		// PojoBean pojoBn = (PojoBean) factory.getBean("pojo"); 
	    // LazyBean bean = (LazyBean) factory.getBean("lzBean");      

		 
		System.out.println("Shutting down and destroying the beans...");	 
		 

        factory.registerShutdownHook();	 
        



    }
}

