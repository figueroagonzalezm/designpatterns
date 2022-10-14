package com.examples.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public AnimalType getType() {
        return AnimalType.DOG;
    }

    @Override
    public String makeNoise() {
        return "Bark!";
    }
}
