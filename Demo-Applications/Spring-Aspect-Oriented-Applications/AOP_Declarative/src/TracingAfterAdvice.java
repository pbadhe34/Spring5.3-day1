import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class TracingAfterAdvice implements AfterReturningAdvice
{
   public void afterReturning(Object object, Method m, Object[] args, Object target) throws Throwable
   {
       System.out.println("TracingAfter! (by " + this.getClass().getName() + "On   "+m.getName()+ ")");
   }
}
