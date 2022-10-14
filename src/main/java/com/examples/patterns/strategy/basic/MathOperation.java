package com.examples.patterns.strategy.basic;

public interface MathOperation {

    int execute(int num1, int num2);
    Operation getOperationType();

    enum Operation {SUM, SUBTRACT, MULTIPLY, DIV}
}
