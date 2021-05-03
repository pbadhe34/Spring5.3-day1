import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
 
public class TestFactoryMethod {

    public static void main(String[] args) 
	{
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("factory.xml"));

        MyClass me = (MyClass) factory.getBean("beanObject");
		me.display();

	    me = (MyClass) factory.getBean("beanObject");
		me.display();   
        

    }

}
           
       