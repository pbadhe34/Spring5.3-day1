 
public class MyFactory
{
    
    MyBean  bn=null;

    public MyBean createBeanObject()
	{
       if(bn==null)
		{
          bn = new MyBean();
		}
		else
		{
           int num = bn.getData();
		   num= num + 3;
		   bn.setData(num);
		}
		return bn;
	} 
     
}
           
       