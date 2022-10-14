package com.examples.patterns.decorator.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lowerCase")
public class LowerCaseDecorator extends PrinterDecorator {
    public LowerCaseDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String msg) {
        this.printer.print(msg.toLowerCase());
    }
}
