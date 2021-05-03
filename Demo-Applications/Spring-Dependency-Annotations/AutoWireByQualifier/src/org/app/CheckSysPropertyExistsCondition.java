package org.app;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CheckSysPropertyExistsCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
	  System.out.println("\nThe CheckSysPropertyExistsCondition matches called");
	  
    Environment env = context.getEnvironment();
    String jre = env.getProperty("JAVA_HOME");
    System.out.println("THE JAVA hOME IS  "+jre);
    String magicValue =  env.getProperty("magicData");
    System.out.println("THE magicData property found is  "+magicValue);
    return env.containsProperty("magicData");
  }
  
}
