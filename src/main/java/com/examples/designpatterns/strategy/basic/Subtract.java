package com.examples.designpatterns.strategy.basic;

import org.springframework.stereotype.Component;

public class Subtract implements MathOperation {
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public Operation getOperationType() {
        return Operation.SUBTRACT;
    }
}
