import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class TestInject {
	 public static void main(String[] args) 
		{
	        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
	                "beans.xml"));

	        CollectionInjectionBean instance = (CollectionInjectionBean) factory.getBean("injectedBean");
	        instance.displayInfo();
	    }

}
