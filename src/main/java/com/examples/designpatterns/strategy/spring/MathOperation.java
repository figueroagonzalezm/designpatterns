package com.examples.designpatterns.strategy.spring;

public interface MathOperation {

    int operation(int num1, int num2);
    Operation getOperationType();

    enum Operation {SUM, SUBTRACT, MULTIPLY, DIV}
}
