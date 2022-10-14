package com.examples.patterns.decorator.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("asterisk")
public class AddAsterisksDecorator extends PrinterDecorator{

    public AddAsterisksDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String msg) {
        this.printer.print("*** "+ msg + " ***");
    }
}
