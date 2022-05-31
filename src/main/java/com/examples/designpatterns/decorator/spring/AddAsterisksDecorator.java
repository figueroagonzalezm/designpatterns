package com.examples.designpatterns.decorator.spring;


public class AddAsterisksDecorator extends PrinterDecorator{

    public AddAsterisksDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String msg) {
        this.printer.print("*** "+ msg + " ***");
    }
}
