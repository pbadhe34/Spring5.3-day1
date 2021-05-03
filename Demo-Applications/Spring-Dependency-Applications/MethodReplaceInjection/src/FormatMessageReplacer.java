import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
//Method Replacer class 
public class FormatMessageReplacer implements MethodReplacer 
{

    public Object reimplement(Object target, Method method, Object[] args)
            throws Throwable
      {
        //Called to replace dynamically the method
		//System.out.println("reimplement(..) for MethodReplacer");
       //Check the correct method to replace..
        if (isFormatMessageMethod(method)) 
		{
           //changing the format of msg rerurned in replcaed method
		    //This is the code being replaced. on original code
            String msg = (String) args[0]+"  Replaced";
            return "<h6>" + msg + "</h6>";
        }
		 else
			{
            throw new IllegalArgumentException("Unable to reimplement method " + method.getName());
           }
    }

    private boolean isFormatMessageMethod(Method method)
	{

        // check correct number of params
        if (method.getParameterTypes().length != 1)
		{
            return false;
        }

        // check method name
        if (!("formatMessage".equals(method.getName())))
		{
            return false;
        }

        // check return type
        if (method.getReturnType() != String.class)
		{
            return false;
        }

        // check parameter type is correct
        if (method.getParameterTypes()[0] != String.class)
		{
            return false;
        }

        return true;
    }

}
