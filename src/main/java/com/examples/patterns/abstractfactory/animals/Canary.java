package com.examples.patterns.abstractfactory.animals;

import com.examples.patterns.abstractfactory.Animal;
import com.examples.patterns.abstractfactory.enums.AnimalType;
import org.springframework.stereotype.Component;

@Component
public class Canary implements Animal {
    @Override
    public AnimalType getType() {
        return AnimalType.CANARY;
    }

    @Override
    public String makeNoise() {
        return "Canary Song!";
    }
}
