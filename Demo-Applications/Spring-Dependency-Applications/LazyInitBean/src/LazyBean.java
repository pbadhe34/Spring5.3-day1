import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class LazyBean implements InitializingBean,
        DisposableBean {

    private InputStream is = null;

    public String filePath = null;
    
    public LazyBean()
    {
    	System.out.println("LazyBean.Constructor()");
    }

    public void afterPropertiesSet() throws Exception
	{

        System.out.println("\nInitializing LazyBean");
		Thread.sleep(4000);
		System.out.println("\nWaiting finished for LazyBean");
		

        if (filePath == null) 
		{
            throw new IllegalArgumentException("You must specify the filePath property for LazyBean");
        }

        is = new FileInputStream(filePath);
    }

    public void destroy() 
	{

        System.out.println("\nDestroying LazyBean in destroy method...");

        if (is != null) {
            try {
                is.close();
                is = null;
            } catch (IOException ex) {
                System.err.println("An IOException occured in LazyBean destroy() "
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


