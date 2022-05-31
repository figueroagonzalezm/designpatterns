package com.examples.designpatterns.decorator.basic;

import java.math.BigDecimal;

public class BigPizza implements Pizza{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.25);
    }

    @Override
    public String getDescription() {
        return "Big Pizza";
    }
}
