package com.magic;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
	  System.out.println("The MagicExistsCondition matches test");
	  
    Environment env = context.getEnvironment();
    String jre = env.getProperty("JAVA_HOME");
    System.out.println("THE JAVA hOME IS  "+jre);
   String magic =  env.getProperty("magicData");
   System.out.println("THE magicData property IS  "+magic);
    return env.containsProperty("magicData");
  }
  
}
