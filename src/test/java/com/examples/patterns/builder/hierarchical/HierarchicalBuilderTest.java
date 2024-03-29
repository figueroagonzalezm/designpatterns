package com.examples.patterns.builder.hierarchical;

import org.junit.jupiter.api.Test;

import static com.examples.patterns.builder.hierarchical.NyPizza.Size.SMALL;
import static com.examples.patterns.builder.hierarchical.Pizza.Topping.*;

class HierarchicalBuilderTest {

    @Test
    void hierarchicalBuilderTest(){
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}