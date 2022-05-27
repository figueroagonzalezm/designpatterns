package com.examples.designpatterns.strategy.spring.service;


import com.examples.designpatterns.strategy.spring.MathOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MathOperationFactory {

    @Autowired
    List<MathOperation> mathOperationList;

    public MathOperation getMathOperation(MathOperation.Operation operation){
        return mathOperationList.stream()
                .filter(mathOperation -> mathOperation.getOperationType() == operation)
                .findFirst().orElseThrow(()-> new UnsupportedOperationException(""));
    }
}
