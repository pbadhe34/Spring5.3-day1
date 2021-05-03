
import java.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

class TestBeanInterface 
{
	public static void main(String[] args) throws Exception 
	{
       /* ConfigurableListableBeanFactory factory = new XmlBeanFactory(
                new FileSystemResource("beans.xml"));
        */
   	 AbstractApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");

        
        MyBean bean = (MyBean)factory.getBean("beanObject");
        
        System.out.println("Calling destroySingletons()");
       // factory.destroySingletons();
        
        factory.registerShutdownHook();
        System.out.println("Finished destroySingletons()");
    }
}
