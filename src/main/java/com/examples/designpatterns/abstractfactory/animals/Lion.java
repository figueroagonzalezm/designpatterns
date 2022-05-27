package com.examples.designpatterns.abstractfactory.animals;

import com.examples.designpatterns.abstractfactory.Animal;
import com.examples.designpatterns.abstractfactory.enums.AnimalType;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

    @Override
    public AnimalType getType() {
        return AnimalType.LION;
    }

    @Override
    public String makeNoise() {
        return "Lion Roar!";
    }
}
