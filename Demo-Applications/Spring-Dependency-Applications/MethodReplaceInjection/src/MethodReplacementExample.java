import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.StopWatch;

//Method injection by replacement

public class MethodReplacementExample
{

    public static void main(String[] args) 
	{
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));

     //Get the bean with method replacement
        ReplacementTarget replacementTarget = (ReplacementTarget) factory
                .getBean("replacementTarget");
		//Get the bean without method replacement
        ReplacementTarget standardTarget = (ReplacementTarget) factory
                .getBean("standardTarget");

        callMethods(replacementTarget);
        callMethods(standardTarget);
    }

    private static void callMethods(ReplacementTarget target) 
	{
        System.out.println(target.formatMessage("Hello World!"));

        StopWatch stopWatch = new StopWatch();
		//If the method replacement is there it will take litte more time
		// to call the replaced METHOD
        stopWatch.start("perfTest");

        for (int x = 0; x < 1000; x++) 
		{
            String out = target.formatMessage("foo");
        }

        stopWatch.stop();

        System.out.println("1000 invocations took: " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
           
