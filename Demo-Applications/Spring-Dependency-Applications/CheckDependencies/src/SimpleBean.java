 
public class SimpleBean {
	

    private int someInt;

    private SimpleBean nestedSimpleBean;
    
    public SimpleBean()
    {
    	System.out.println("SimpleBean.SimpleBean()");
    }

    public void setSomeInt(int someInt) {
    	System.out.println("SimpleBean.setSomeInt()");
        this.someInt = someInt;
    }

    public void setNestedSimpleBean(SimpleBean nestedSimpleBean) {
    	System.out.println("SimpleBean.setNestedSimpleBean()");
        this.nestedSimpleBean = nestedSimpleBean;
    }

    
}

