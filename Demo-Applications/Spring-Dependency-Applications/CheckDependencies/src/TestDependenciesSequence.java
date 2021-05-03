import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestDependenciesSequence {

	public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
                "beans.xml"));
        
       // SimpleBean bean1 = (SimpleBean)factory.getBean("dependentBean");
        SimpleBean bean2 = (SimpleBean)factory.getBean("noDependBean");
       
    }
}
