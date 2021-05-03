import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SharedObjectTest {

    public static void main(String[] args)
	{
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
        
        MyBean s1 = (MyBean)factory.getBean("bean1");
        MyBean s2 = (MyBean)factory.getBean("bean2");
        MyBean s3 = (MyBean)factory.getBean("bean3");
        MyBean s4 = (MyBean)factory.getBean("bean4");

		s1.setName("Ashok");	
		
		//again read for first bean
		boolean flag = factory.isSingleton("bean1");
		System.out.println("The MyBean object scope is singleton :  "+flag);		


        MyBean s11 = (MyBean)factory.getBean("bean1");
		System.out.println("Another MyBean object Name is "+s11.getName());

        System.out.println(s2.getName());
		System.out.println("Objects are equal  "+(s1==s2));
        System.out.println(s3.getName());
        System.out.println(s4.getName());
		 
        String[] x = factory.getAliases("bean1");
        System.out.println("Number of aliases are "+x.length);
        System.out.println("\n\n");
       // MyBean obj = (MyBean)factory.getBean("bean");
    }
}
