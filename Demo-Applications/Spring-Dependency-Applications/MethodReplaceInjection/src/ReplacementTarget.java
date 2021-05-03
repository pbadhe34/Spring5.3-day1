public class ReplacementTarget {

   //Over loaded methods..
    public String formatMessage(String msg)
	{
		//System.out.println("Original formatMessage for String parameter");
        return "<h1>" + msg + "</h1>";
    }
    
    public String formatMessage(Object msg)
	{
        System.out.println("Original formatMessage for Object parameter");       
		return "<h1>" + msg + "</h1>";
    }
    
    public void Operate()
	{
        System.out.println("Just another method");
       
    }
}
