package com.examples.patterns.decorator.basic;

public abstract class PizzaIngredientDecorator implements Pizza{

    protected Pizza pizza;

    public PizzaIngredientDecorator(Pizza pizza) {
        this.pizza = pizza;
    }


}
