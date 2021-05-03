
import java.io.*;
public class BusinessLogic implements IBusinessLogic,Serializable
{
     public void Myfoo() 
     {
       System.out.println("Inside BusinessLogic.foo()");
     }

	 public void update()
	{
       System.out.println("Inside BusinessLogic.update()");
	}
}
