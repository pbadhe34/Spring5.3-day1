 
import java.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MyBean implements InitializingBean,DisposableBean 
{
//standard Bean life cycle methods
    private InputStream is = null;

    public String filePath = null;

	public void setFilePath(String filePath)
	{
        this.filePath = filePath;
    }

    public void afterPropertiesSet() throws Exception
	{

        System.out.println("\nInitializing Bean in afterProperties Set\n");

        if (filePath == null)
		{
            throw new IllegalArgumentException(
                    "You must specify the filePath property ");
        }

        is = new FileInputStream(filePath);
    }

    public void destroy() 
	{

        System.out.println("\nDestroying Bean in destroy method...\n");

        if (is != null) 
			{
            try 
			{
                is.close();
                is = null;
            } 
			catch (IOException ex)
			{
                System.err.println("An IOException occured"
                        + " trying to close the InputStream");
            }
        }
    }

    
}
