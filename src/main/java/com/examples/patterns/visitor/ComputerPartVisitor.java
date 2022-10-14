package com.examples.patterns.visitor;

public interface ComputerPartVisitor {
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
}
