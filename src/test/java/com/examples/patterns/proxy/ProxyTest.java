package com.examples.patterns.proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {


    @Test
    public void testProxy(){
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
