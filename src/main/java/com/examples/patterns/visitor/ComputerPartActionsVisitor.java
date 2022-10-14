package com.examples.patterns.visitor;

public class ComputerPartActionsVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Performing Mouse tasks");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Performing Keyboard tasks");
    }


}
