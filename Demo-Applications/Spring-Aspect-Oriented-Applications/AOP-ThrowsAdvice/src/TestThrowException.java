import org.springframework.aop.framework.ProxyFactory;


public class TestThrowException {
	public static void main(String[] args) throws Exception
	{
        ErrorBean errorBean = new ErrorBean();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(errorBean);
        pf.addAdvice(new SimpleThrowsAdvice());

        ErrorBean proxy = (ErrorBean) pf.getProxy();

        //try 
		{
            proxy.errorProneMethod();
        } 
		//catch (Exception ignored) 
		{

        }
		
	     proxy.otherErrorProneMethod();
/*
        try 
		{
           proxy.otherErrorProneMethod();
        }
		catch (Exception ignored)
		{
            System.out.println("Exception  "+ignored.getMessage());
        }*/

    }
}
