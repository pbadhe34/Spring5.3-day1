import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HierarchicalBeanFactoryUsage
{

    public static void main(String[] args) {
        BeanFactory parent = new XmlBeanFactory(new FileSystemResource(
                "parent.xml"));
        BeanFactory child = new XmlBeanFactory(new FileSystemResource(
                "beans.xml"), parent);

        SimpleTargetBean target1 = (SimpleTargetBean) child.getBean("target1");
        SimpleTargetBean target2 = (SimpleTargetBean) child.getBean("target2");
        SimpleTargetBean target3 = (SimpleTargetBean) child.getBean("target3");

        System.out.println(target1.getVal());
        System.out.println(target2.getVal());
        System.out.println(target3.getVal());
    }
}

