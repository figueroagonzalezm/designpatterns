package com.examples.designpatterns.abstractfactory.animals;

import com.examples.designpatterns.abstractfactory.Animal;
import com.examples.designpatterns.abstractfactory.enums.AnimalType;
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
