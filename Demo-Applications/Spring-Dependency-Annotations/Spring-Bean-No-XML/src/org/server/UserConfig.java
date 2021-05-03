package org.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.server.MyBeanClass;

@Configuration
public class UserConfig {

	   @Bean(initMethod="verifyInit",destroyMethod="clearName",name="userBean") 
	   public MyBeanClass getMyBean(){
		   MyBeanClass bean = new MyBeanClass();
		   bean.setName("Mourya");
	       return bean;
	   }

}
