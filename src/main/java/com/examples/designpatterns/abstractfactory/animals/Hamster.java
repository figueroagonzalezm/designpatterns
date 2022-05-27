package com.examples.designpatterns.abstractfactory.animals;

import com.examples.designpatterns.abstractfactory.Animal;
import com.examples.designpatterns.abstractfactory.enums.AnimalType;
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
