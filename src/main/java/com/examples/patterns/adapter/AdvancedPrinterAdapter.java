package com.examples.patterns.adapter;

public class AdvancedPrinterAdapter implements BasicPrinter {

    private final AdvancedPrinter advancedPrinter;

    public AdvancedPrinterAdapter(AdvancedPrinter advancedPrinter) {
        this.advancedPrinter = advancedPrinter;
    }

    @Override
    public String getModel() {
        return advancedPrinter.getModel();
    }

    @Override
    public void print() {
        advancedPrinter.printInColor();
        advancedPrinter.scanDocument();
    }


}
