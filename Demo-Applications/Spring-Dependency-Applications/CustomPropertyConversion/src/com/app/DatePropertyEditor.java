
package com.app;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.text.*;

public class DatePropertyEditor extends PropertyEditorSupport
{
  //Override the method from base class
    public void setAsText(String text) throws IllegalArgumentException 
	{
		try
		{
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);//SHORT is "M/d/yy"  in en
			 
			Date date  = df.parse(text);
			setValue(date);
		}
		catch(Exception e)
		{
           setValue(null);
		   throw new IllegalArgumentException("Date Format not proper");
		}
    }
}

      