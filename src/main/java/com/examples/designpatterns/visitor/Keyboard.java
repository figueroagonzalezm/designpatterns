package com.examples.designpatterns.visitor;

public class Keyboard extends ComputerPart {


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
