package com.examples.patterns.builder;

import org.junit.jupiter.api.Test;

class BuilderTest {

    @Test
    void builderTest(){
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);
    }

}