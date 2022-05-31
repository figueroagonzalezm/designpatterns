package com.examples.designpatterns.visitor;

public abstract class ComputerPart {

    public abstract void accept(ComputerPartVisitor computerPartVisitor);

}
