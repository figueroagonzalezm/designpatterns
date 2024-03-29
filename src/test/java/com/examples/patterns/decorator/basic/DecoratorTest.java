package com.examples.patterns.decorator.basic;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        BigPizza bigPizza = new BigPizza();
        System.out.println(bigPizza.getDescription());
        System.out.println(bigPizza.getCost());

        Peperoni peperoni = new Peperoni(new BigPizza());
        System.out.println(peperoni.getDescription());
        System.out.println(peperoni.getCost());

        Pineapple pineapple = new Pineapple(peperoni);
        System.out.println(pineapple.getDescription());
        System.out.println(pineapple.getCost());
    }
}
