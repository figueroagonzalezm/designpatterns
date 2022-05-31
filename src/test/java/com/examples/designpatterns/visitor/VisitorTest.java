package com.examples.designpatterns.visitor;

import org.junit.jupiter.api.Test;
/*
The purpose of a Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.

Imagine that we have a composite object which consists of components. The object's structure is fixed –
we either can't change it, or we don't plan to add new types of elements to the structure.
*/


public class VisitorTest {

    @Test
    public void testVisitor() {
        ComputerPartVisitor visitor = new ComputerPartActionsVisitor();

        Computer computer = new Computer();
        computer.getElements().add(new Mouse());
        computer.getElements().add(new Keyboard());

        computer.accept(visitor);

    }

}
