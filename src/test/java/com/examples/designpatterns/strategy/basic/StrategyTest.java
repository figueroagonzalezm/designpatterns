package com.examples.designpatterns.strategy.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyTest {

    @Test
    public void testStrategy(){
        OperationManager operationManager = new OperationManager(new Multiply());
        int result1 = operationManager.execute(20, 10);

        operationManager = new OperationManager(new Sum());
        int result2 = operationManager.execute(20, 10);

        operationManager = new OperationManager(new Subtract());
        int result3  = operationManager.execute(20, 10);

        assertThat(result1).isEqualTo(200);
        assertThat(result2).isEqualTo(30);
        assertThat(result3).isEqualTo(10);

    }
}
