package com.examples.patterns.abstractfactory.animals;

import com.examples.patterns.abstractfactory.Animal;
import com.examples.patterns.abstractfactory.enums.AnimalType;
import org.springframework.stereotype.Component;

@Component
public class Hamster implements Animal {
    @Override
    public AnimalType getType() {
        return AnimalType.HAMSTER;
    }

    @Override
    public String makeNoise() {
        return "Hamster sound!";
    }
}
