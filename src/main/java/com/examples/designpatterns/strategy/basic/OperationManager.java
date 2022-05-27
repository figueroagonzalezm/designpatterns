package com.examples.designpatterns.strategy.basic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OperationManager {

    private final MathOperation mathOperation;

    public int execute(int num1, int num2) {
        return mathOperation.execute(num1, num2);
    }


}
