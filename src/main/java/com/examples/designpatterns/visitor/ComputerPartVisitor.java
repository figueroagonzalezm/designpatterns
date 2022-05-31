package com.examples.designpatterns.visitor;

public interface ComputerPartVisitor {
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
}
