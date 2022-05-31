package com.examples.designpatterns.decorator.basic;

import java.math.BigDecimal;

public class Peperoni extends PizzaIngredientDecorator{

    public Peperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(2).add(this.pizza.getCost());
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + peperoni";
    }
}
