package com.examples.patterns.strategy.spring;

import org.springframework.stereotype.Component;

@Component
public class Subtract implements MathOperation {
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public Operation getOperationType() {
        return Operation.SUBTRACT;
    }
}
