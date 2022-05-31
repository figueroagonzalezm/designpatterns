package com.examples.designpatterns.decorator.spring;

import java.util.Locale;

public class UpperCaseDecorator extends PrinterDecorator{

    public UpperCaseDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String msg) {
        this.printer.print(msg.toUpperCase());
    }
}
