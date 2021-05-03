 
public class MyClass
{
   int number;
   MyBean  bean;

   public void setNumber(int no)
	{
      number = no;
	}

	 public void setBean(MyBean br)
	 {
      bean = br;
	 }

	 public void display()
	 {
        int data =  bean.getData();
		System.out.println("The Data now is  "+data);
	 }
    

     
}
           
       