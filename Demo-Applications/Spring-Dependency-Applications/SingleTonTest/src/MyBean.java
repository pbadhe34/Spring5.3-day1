class MyBean 
{
	public String name;

	public MyBean()
	{
      System.out.println("MyBean Constructor!");

	}
	
	 public void setName(String n)
	 {
		 System.out.println("MyBean setName with "+n);
		 name=n;
	 }

     public String getName()
	 {
		 System.out.println("MyBean getName ");
		 return name;
	 }

}
