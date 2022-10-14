package com.examples.patterns.adapter;

public class XeroxPrinter implements AdvancedPrinter {

    @Override
    public String getModel() {
        return "Xerox";
    }

    @Override
    public void printInColor() {
        System.out.println("Printing in color");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document");
    }
}
