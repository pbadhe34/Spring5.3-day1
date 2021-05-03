import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
 
public class TracingBeforeAdvice implements MethodBeforeAdvice
{
   public void before(Method m, Object[] args, Object target) throws Throwable
   {
      System.out.println("TracingBefore (by " + this.getClass().getName()+"On   "+m.getName() + ")");
   }
}