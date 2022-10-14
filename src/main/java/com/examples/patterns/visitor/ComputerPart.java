package com.examples.patterns.visitor;

public abstract class ComputerPart {

    public abstract void accept(ComputerPartVisitor computerPartVisitor);

}
