package com.examples.designpatterns.decorator.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DecoratorTest {

    @Autowired
    @Qualifier("asterisk")
    PrinterDecorator addAsterisksDecorator;

    @Test
    public void testDecorator() {
        addAsterisksDecorator.print("Hello from decorator");
    }

}
