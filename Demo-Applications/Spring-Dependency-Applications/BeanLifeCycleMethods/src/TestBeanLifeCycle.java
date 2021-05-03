import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestBeanLifeCycle {
	public static void main(String[] args) {
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"initMethod.xml"));
		*/
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("initMethod.xml");

	     
	 
		SimpleBean simpleBean1 = getBean("simpleBean1", context);
		SimpleBean simpleBean2 = getBean("simpleBean2", context);
		SimpleBean simpleBean3 = getBean("simpleBean3", context);
		
		context.registerShutdownHook();
		 
	}

	private static SimpleBean getBean(String beanName, BeanFactory factory) {
		try {
			SimpleBean bean = (SimpleBean) factory.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: "
					+ ex.getMessage());
			return null;
		}
	}

}
