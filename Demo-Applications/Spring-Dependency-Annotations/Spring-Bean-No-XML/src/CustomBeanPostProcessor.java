import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 
 */

/**
 * @author Prakash
 * A bean post processor allows additional processing before and after the bean initialization callback method.
 *  The main characteristic of a bean post processor is that it will process all the bean instances in the IoC container one by one,
 *  not just a single bean instance. 
 *  Typically, bean post processors are used for checking the validity of bean properties or altering bean properties according to certain criteria.


 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

	 
	public Object postProcessBeforeInitialization(Object obj, String property) throws BeansException {
		System.out.println("CustomBeanPostProcessor.postProcessBeforeInitialization() for "+obj+" with value as  "+property);
		return obj;
	}
	 
	public Object postProcessAfterInitialization(Object obj, String prop) throws BeansException {
		 System.out.println("\nCustomBeanPostProcessor.postProcessAfterInitialization() for "+obj+" with value as  "+prop);
		 return obj;
	}

	 
	 
	

}
