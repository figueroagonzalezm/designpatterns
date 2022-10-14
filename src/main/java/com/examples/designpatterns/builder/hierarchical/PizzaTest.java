package com.examples.designpatterns.builder.hierarchical;


import static com.examples.designpatterns.builder.hierarchical.NyPizza.Size.SMALL;
import static com.examples.designpatterns.builder.hierarchical.Pizza.Topping.*;

// Using the hierarchical builder (Page 16)
public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
