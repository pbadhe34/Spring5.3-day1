import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestCustomEditor
{

    private Pattern searchPattern;

    private String textToSearch;

	private Date myDate;

    public static void main(String[] args)
	{
        ConfigurableListableBeanFactory factory = new XmlBeanFactory(
                new FileSystemResource("beans.xml"));

        //Load the property convrters
        CustomEditorConfigurer config = (CustomEditorConfigurer) factory
                .getBean("customEditorConfigurer");

        config.postProcessBeanFactory(factory);//Process the bean definitions loaded

        TestCustomEditor bean = (TestCustomEditor)factory
                .getBean("CustomBean");

        System.out.println("The matching values for "+bean.searchPattern+"  count is "+bean.getMatchCountFromSearch());
		System.out.println("The date is  "+bean.myDate);

    }

    public void setSearchPattern(Pattern searchPattern)
	{
        this.searchPattern = searchPattern;
    }

    public void setTextToSearch(String textToSearch)
	{
        this.textToSearch = textToSearch;
    }
	public void setMyDate(Date d)
	{
         myDate = d;
    }

    public int getMatchCountFromSearch()
	{
        Matcher m = searchPattern.matcher(textToSearch);

        int count = 0;
        while (m.find())
		{
            count++;
        }

        return count;
    }
}

           
