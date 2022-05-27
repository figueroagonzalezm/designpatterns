package com.examples.designpatterns.strategy.spring;

import org.springframework.stereotype.Component;

@Component
public class Multiply implements MathOperation {
    @Override
    public int operation(int num1, int num2) {
        return  num1 * num2;
    }

    @Override
    public Operation getOperationType() {
        return Operation.MULTIPLY;
    }
}
