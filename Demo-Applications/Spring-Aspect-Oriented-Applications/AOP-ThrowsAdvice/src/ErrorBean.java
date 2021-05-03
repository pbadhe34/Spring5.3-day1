public class ErrorBean {

    public void errorProneMethod() throws Exception
	{
		System.out.println("There is no error this time...");
        throw new Exception("Foo");
    }

    public void otherErrorProneMethod() //throws IllegalArgumentException
    {
    System.out.println("ErrorBean.otherErrorProneMethod()");
     ///   throw new IllegalArgumentException("Bar");
    }
}
