package com.examples.designpatterns.adapter;

import org.junit.jupiter.api.Test;


public class AdapterTest {

    @Test
    public void testAdapter(){
        AdvancedPrinter xerox = new XeroxPrinter();
        BasicPrinter epson = new AdvancedPrinterAdapter(xerox);

        System.out.println(epson.getModel());
        epson.print();
    }
}
