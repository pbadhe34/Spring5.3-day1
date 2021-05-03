

public class Target
{

    private Foo foo;
    private Foo foo2;
	private java.lang.String name;
    
    private Bar bar;
    
    private Bar barObj;

     //Try commenting this constrructor!
	  
    public Bar getBarObj() {
		return barObj;
	}

	public void setBarObj(Bar barObj) {
		System.out.println("Target.setBarObj()");
		this.barObj = barObj;
	}

	public Target() 
	{
        System.out.println("Target Default Constructor");  
    } 
	     
    public Target(Foo foo) {
        System.out.println("Target(Foo) called");
    }	 

	public Target(Foo foo, Foo foo2) {
        System.out.println("Target(Foo,Foo2) called");
    } 
    
	public Target(Bar bar,Foo foo,String name) {
        System.out.println("Target(Bar,Foo,name) called");
    }
	 
  //The last matching constructor sen  by container in autodetect mode will be used
	 public Target(Bar bar,Foo foo) {
        System.out.println("Target(Bar,Foo) called");
    }

	public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }    
    
    public void setName(java.lang.String n) {
        this.name = n;
        System.out.println("Property name set");
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
        System.out.println("Property foo set");
    }
    
    public void setFoo2(Foo foo2) {
        this.foo2 = foo2;
        System.out.println("Property foo2 set");
    }

 //in byType mode this must have setXXX to set bar property

    public void setMyBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property myBarProperty set");
    }

    
    public void testTheBar()
    {
    	if(barObj==null)
    		System.out.println("Target update ");
    	else
    		barObj.update();
    }
     
}

