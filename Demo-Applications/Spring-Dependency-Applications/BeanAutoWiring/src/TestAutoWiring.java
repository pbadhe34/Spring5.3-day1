import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class TestAutoWiring {

	public static void main(String[] args) 
	{
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
                "beans.xml"));
        
         
        
       // ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        
        Target t = null;        
		 
        System.out.println("Using byName:\n");
        t = (Target) factory.getBean("beanByName");
        t.testTheBar();
        
        System.out.println("\nUsing byType:\n");
        t = (Target) factory.getBean("beanByType");
        
        System.out.println("\nUsing ByConstructor:\n");
        t = (Target) factory.getBean("beanByConstructor");
		  
        
        System.out.println("\nUsing default autowire mode set by the bean factory container  \n");
        t = (Target) factory.getBean("beanByDefault");
        
         
        
    }

}
