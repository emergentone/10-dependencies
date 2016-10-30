package org.gradle.tests0;

import org.gradle.Person;
import org.junit.Test;

public class Test0_0 {
    @Test
    public void myTest() throws Exception {
    	Person p = new Person("p");
    	//throw new RuntimeException("Foo");
        Thread.sleep(150);
    }
}