package com.examples.patterns.decorator.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upperCase")
public class UpperCaseDecorator extends PrinterDecorator{

    public UpperCaseDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String msg) {
        this.printer.print(msg.toUpperCase());
    }
}
