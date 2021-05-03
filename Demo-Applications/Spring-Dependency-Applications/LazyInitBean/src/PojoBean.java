import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
 

public class PojoBean implements InitializingBean,
        DisposableBean {

    private InputStream is = null;

    public String filePath = null;
    
    public PojoBean()
    {
    	System.out.println("PojoBean.Constructor()");
    }

    public void afterPropertiesSet() throws Exception
	{

        System.out.println("\nInitializing PojoBean");
		Thread.sleep(4000);
		System.out.println("\nWaiting finished for PojoBean");
		
        File destFile = new File(filePath);
        if (filePath == null || destFile.exists()==false) 
		{
            throw new IllegalArgumentException("You must specify the filePath property for PojoBean");
        }

        is = new FileInputStream(filePath);
    }

    public void destroy() 
	{

        System.out.println("\nDestroying PojoBean in destroy method...");

        if (is != null) {
            try {
                is.close();
                is = null;
            } catch (IOException ex) {
                System.err.println("An IOException occured in PojoBean destroy() "
                        + " trying to close the InputStream");
            }
        }
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
	public void display()
	{
       System.err.println("The filePath is     "+filePath);
	}
}


