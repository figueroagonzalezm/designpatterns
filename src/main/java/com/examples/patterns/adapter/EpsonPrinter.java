package com.examples.patterns.adapter;

public class EpsonPrinter implements BasicPrinter {
    @Override
    public String getModel() {
        return "Epson";
    }

    @Override
    public void print() {
        System.out.println("Basic Printer printing in Black");
    }
}
