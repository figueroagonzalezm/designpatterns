package com.examples.patterns.visitor;

public class Keyboard extends ComputerPart {


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
