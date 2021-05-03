 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Login;

 


public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	Login bean = (Login) ctx.getBean("login");
    	bean.login();
    }
}
