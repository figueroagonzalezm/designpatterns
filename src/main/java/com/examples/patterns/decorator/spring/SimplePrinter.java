package com.examples.patterns.decorator.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SimplePrinter implements Printer {

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
