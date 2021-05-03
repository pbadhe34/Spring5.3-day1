package org.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.server.MyBeanClass;

@Configuration
@Import(TestConfig.class)
public class MyConfig {

	   @Bean(initMethod="verifyInit",destroyMethod="clearName",name="testBean") 
	   @Scope("singleton")
	   public MyBeanClass getBeanObj(){
		   MyBeanClass bean = new MyBeanClass();
		   bean.setName("Asoka");
	       return bean;
	   }

}
