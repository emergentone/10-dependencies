package org.gradle.tests0;

import java.io.InputStream;
import java.util.Properties;

import org.gradle.Person;
import org.junit.Test;

public class Test0_0 {
    @Test
    public void myTest() throws Exception {
    	Person p = new Person("p");
    	
    	InputStream is = p.getClass().getResourceAsStream("/test.properties");
    	Properties testProps = new Properties();
    	testProps.load(is);
    	
    	if (testProps.getProperty("service.url") == null || testProps.getProperty("service.url").length() < 1) {
    	  throw new IllegalArgumentException("Filtered test results cannot be missing!");
    	} else {
          Thread.sleep(150);
    	}
    }
}