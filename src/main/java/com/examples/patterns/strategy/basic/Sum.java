package com.examples.patterns.strategy.basic;

public class Sum implements MathOperation {
    @Override
    public int execute(int num1, int num2) {
        return  num1 + num2;
    }

    @Override
    public Operation getOperationType() {
        return Operation.SUM;
    }


}
