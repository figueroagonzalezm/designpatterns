package com.examples.designpatterns.decorator.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Locale;

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
