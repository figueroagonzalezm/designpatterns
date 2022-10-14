package com.examples.patterns.visitor;

import java.util.ArrayList;
import java.util.List;


public class Computer extends ComputerPart {

    private final List<ComputerPart> computerParts;

    public Computer() {
        computerParts = new ArrayList<>();
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerParts.forEach(computerPart -> computerPart.accept(computerPartVisitor));

    }

    public List<ComputerPart> getElements() {
        return computerParts;
    }
}
