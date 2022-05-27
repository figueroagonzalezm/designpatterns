package com.examples.designpatterns.factory;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public AnimalType getType() {
        return AnimalType.CAT;
    }

    @Override
    public String makeNoise() {
        return "Meow!";
    }
}
