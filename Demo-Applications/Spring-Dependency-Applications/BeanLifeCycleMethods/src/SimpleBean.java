

public class SimpleBean
{

    private static final String DEFAULT_NAME = "Ashok Gupta";

    private String name = null;

    private int age = Integer.MIN_VALUE;

    public void setName(String name)
	{
        this.name = name;
    }

    public void setAge(int age) 
	{
        this.age = age;
    }

    public void initBean() 
	{
        System.out.println("Initializing bean");

       if (name == null) 
		{
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }

        if (age < 0) 
		{
			System.out.println("The  age is not correctly set!");
            throw new IllegalArgumentException(
                    "You must set the age property of any beans of type " + SimpleBean.class);
        }
    }

    public String toString()
	{
        return "Name: " + name + "\nAge: " + age;
    }

	 public void MyDestroyMethod() 
	 {
        System.out.println("\nDestroying the Bean withName as :  "+name);
        name= null;
	 }   

    
    

}
