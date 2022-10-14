package com.examples.patterns.strategy.spring.service;


import com.examples.patterns.strategy.spring.MathOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Autowired
    MathOperationFactory operationFactory;

    public int operation(int num1, int num2, MathOperation.Operation operation){
        MathOperation mathOperation = operationFactory.getMathOperation(operation);
        return mathOperation.operation(num1, num2);
    }
}
