package com.examples.designpatterns.decorator.spring;

public class LowerCaseDecorator extends PrinterDecorator{
    public LowerCaseDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String msg) {
        this.printer.print(msg.toLowerCase());
    }
}
