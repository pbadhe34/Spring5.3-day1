package org.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.data.MyClass;

@Configuration
public class MagicConfig {

  @Bean(name="conditionalBean")
  @Conditional(CheckSysPropertyExistsCondition.class)
  public MyClass getConditionalBeanObject() {
	System.out.println("\nMagicConfig.getConditionalBeanObject()");
    return new MyClass();
  }
  
}