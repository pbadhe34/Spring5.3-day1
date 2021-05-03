package com.app;
import java.beans.PropertyEditorSupport;
import java.util.regex.Pattern;

public class PatternPropertyEditor extends PropertyEditorSupport
{
   //Override the method from base class
    public void setAsText(String text) throws IllegalArgumentException 
	{
        Pattern pattern = Pattern.compile(text);
        setValue(pattern);
    }
}

      