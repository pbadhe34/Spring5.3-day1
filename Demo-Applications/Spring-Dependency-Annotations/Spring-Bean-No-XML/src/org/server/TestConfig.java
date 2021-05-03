package org.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.server.MyBeanClass;

@Configuration
public class TestConfig {

	   @Bean(initMethod="verifyInit",destroyMethod="clearName",name="BabaBean") 
	   @Scope("prototype")
	   public MyBeanClass getMyBean(){
		   MyBeanClass bean = new MyBeanClass();
		   bean.setName("Baba");
	       return bean;
	   }

}
