package com.examples.designpatterns.strategy.spring;

import com.examples.designpatterns.strategy.spring.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.examples.designpatterns.strategy.spring.MathOperation.Operation.*;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class StrategyTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    public void testStrategy(){

        int result = calculatorService.operation(20, 10, MULTIPLY);
        assertThat(result).isEqualTo(200);
        result = calculatorService.operation(20, 10, SUM);
        assertThat(result).isEqualTo(30);
        result = calculatorService.operation(20, 10, SUBTRACT);
        assertThat(result).isEqualTo(10);

    }
}
