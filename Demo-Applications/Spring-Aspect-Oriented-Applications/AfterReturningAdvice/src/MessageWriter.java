public class MessageWriter implements IMessageWriter{

    public void writeMessage(String message) 
	{
		 int d = 0;
        System.out.println("Hi World\n");
		System.out.println("The Writer data is  "+data);
		System.out.println("The Writer message is  "+message);
		if(1==2)
		{
			 d = 100/0; 
		}
    }
	String data;

}
