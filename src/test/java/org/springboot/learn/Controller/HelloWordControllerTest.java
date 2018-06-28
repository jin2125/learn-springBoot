package org.springboot.learn.Controller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWordControllerTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello, World!", new HelloWorldController().sayHello());
    }
}
