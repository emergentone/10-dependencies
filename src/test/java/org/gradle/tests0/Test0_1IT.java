package org.gradle.tests0;

import org.company.Program;
import org.junit.Test;
import example.avro.User;

public class Test0_1IT {
    @Test
    public void myTest() throws Exception {
    	Program p = new Program();
    	User u = User.newBuilder().setName("foo").setFavoriteNumber(17).setFavoriteColor("green").build();
        Thread.sleep(5);
    }
}