import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
 
public class TestFactoryClass 
{

    public static void main(String[] args) 
	{
        BeanFactory factory = new XmlBeanFactory
			                  (new FileSystemResource("factory.xml"));

        MyClass me = (MyClass) factory.getBean("beanObject");
        System.out.println("The dependency for MyClass bean is "+me.bean.getData());
		me.display();   

	    me = (MyClass) factory.getBean("beanObject");
	    System.out.println("The dependency for MyClass bean is "+me.bean.getData());
		me.display(); 
        

    }

}
           
       