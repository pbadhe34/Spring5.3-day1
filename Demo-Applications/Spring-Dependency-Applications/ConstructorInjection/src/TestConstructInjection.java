
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class TestConstructInjection {

	/**
	 * @param args
	 */
	 public static void main(String[] args)
		{
	         
			BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
	                "beans.xml"));

	        BeanClass cc = (BeanClass) 
				factory.getBean("obj1");
	        System.out.println(cc);
			BeanClass cc2 = (BeanClass) factory.getBean("obj2");
	        System.out.println(cc2);
			BeanClass cc3 = (BeanClass) factory.getBean("obj3");
	        System.out.println(cc3);
			BeanClass cc4 = (BeanClass) factory.getBean("obj4");
	        System.out.println(cc4);
			BeanClass cc5 = (BeanClass) factory.getBean("obj5");
	        System.out.println(cc5);
			BeanClass cc6 = (BeanClass) factory.getBean("obj6");
	        System.out.println(cc6);
			 

			 
	    }
}
