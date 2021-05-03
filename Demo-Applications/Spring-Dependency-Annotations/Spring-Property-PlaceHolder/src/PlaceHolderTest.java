 

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.data.config.EnvironmentConfig;
import com.data.config.EnvironmentConfigWithDefaults;
import com.data.config.EnvironmentConfigWithRequiredProperties;
import com.data.sound.BlankDisc;

public class PlaceHolderTest {

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=EnvironmentConfig.class)
  public static class TestInjectFromProperties {
  
    @Autowired
    private BlankDisc blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("The Brigediers", blankDisc.getArtist());
      assertEquals("The Lonely Hearts Club", blankDisc.getTitle());
    }
    
  }
  
  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=EnvironmentConfigWithDefaults.class)
  public static class InjectFromPropertiesWithDefaultValues {
  
    @Autowired
    private BlankDisc blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("UB2", blankDisc.getArtist());
      assertEquals("Rattle and Hum", blankDisc.getTitle());
    }
    
  }

  public static class InjectFromPropertiesWithRequiredProperties {
  
    @Test(expected=BeanCreationException.class)
    public void assertBlankDiscProperties() {
      new AnnotationConfigApplicationContext(EnvironmentConfigWithRequiredProperties.class);
    }
    
  }

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration("classpath:placeholder-config.xml")
  public static class InjectFromProperties_XMLConfig {
  
    @Autowired
    private BlankDisc blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("The Brigediers", blankDisc.getArtist());
      assertEquals("The Lonely Hearts Club", blankDisc.getTitle());
    }
    
  }

}