 

public class BeanClass
{

    private String someValue;
	private int data;

	//setter property methods
    //public void setSomevalue(String newValue)will not work
	public void setSomeValue(String newValue)
	{
		  System.out.println("Setting the property someValue");
          someValue = newValue;
	}
	public void setData(int Value)
	{
		  System.out.println("Setting the property data");
          data = Value;
	}
	//Constructors
	public BeanClass()
	{
        System.out.println("ConstructorInjection(Default) called");         
    }

    public BeanClass(String Value)
	{
        System.out.println("ConstructorInjection(String) called");
        this.someValue = Value;
    }

    public BeanClass(int Val) 
	{
        System.out.println("ConstructorInjection(int) called");
		//We wil have to explicitly convert it to string type
        //this.someValue = "Number: " + Integer.toString(Val);
		data=Val;
    }
	public BeanClass(String value,int val)
	{
        System.out.println("ConstructorInjection(String,int) called");
        this.someValue = value;
		data = val;
	}

   
    public String toString()
	{
        return "Object with "+someValue +" and "+data;
    }
}