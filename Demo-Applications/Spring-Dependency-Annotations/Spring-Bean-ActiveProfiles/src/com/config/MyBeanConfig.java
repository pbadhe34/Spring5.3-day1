
package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import com.data.MyBeanClass;

 

@Configuration 
public class MyBeanConfig {

	   @Bean(initMethod="verifyInit",destroyMethod="clearName") 
	   @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	   @Profile("dev")
	   public MyBeanClass getBeanObjectInDev(){
		   MyBeanClass bean = new MyBeanClass();
		   bean.setName("Viju Developer");
	       return bean;
	   }
	   
	   @Bean(initMethod="verifyInit",destroyMethod="clearName") 
	   @Scope("singleton")
	   @Profile("test")
	   public MyBeanClass getTestObject(){
		   MyBeanClass bean = new MyBeanClass();
		   bean.setName("Baba Tester");
	       return bean;
	   }
	   
	   @Bean(initMethod="verifyInit",destroyMethod="clearName") 
	   @Scope("singleton")
	   @Profile("Production")
	   public MyBeanClass getReleaseObject(){
		   MyBeanClass bean = new MyBeanClass();
		   bean.setName("Cusomer User in Production");
	       return bean;
	   }

}
