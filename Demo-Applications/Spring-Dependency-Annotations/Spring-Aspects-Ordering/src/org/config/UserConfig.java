package org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.beans.LoggerA;
import com.beans.User;

@Configuration
@EnableAspectJAutoProxy
public class UserConfig {
	
	
	@Bean (name="obj") 
	public User getBean()
	  {
		  return new User();
	  }
	
	@Bean  
	public LoggerA getSpect()
	  {
		  return new LoggerA();
	  }
	
	 
}
