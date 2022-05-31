package com.examples.designpatterns.decorator.basic;

import java.math.BigDecimal;

public class Pineapple extends PizzaIngredientDecorator{

    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(1).add(this.pizza.getCost());
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + pineapple";
    }
}
