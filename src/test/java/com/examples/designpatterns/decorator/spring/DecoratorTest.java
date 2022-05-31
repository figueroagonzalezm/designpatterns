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

    @Autowired
    @Qualifier("lowerCase")
    PrinterDecorator lowerCaseDecorator;

    @Autowired
    @Qualifier("upperCase")
    PrinterDecorator upperCaseDecorator;

    @Test
    public void testDecorator() {
        String message = "Hello From Decorator";
        lowerCaseDecorator.print(message);
        upperCaseDecorator.print(message);
        addAsterisksDecorator.print(message);


    }

}
