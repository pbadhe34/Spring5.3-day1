 

import java.util.Date;
 
public class SampleInterfaceImpl implements SampleInterface
{
  public Date getCurrentDate()
  {
    return new Date();
  }

  public void printMessage(String msg)
	{
          System.out.println("Here is your message  "+msg);
	}
}
