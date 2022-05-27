package com.examples.designpatterns.abstractfactory.animals;

import com.examples.designpatterns.abstractfactory.Animal;
import com.examples.designpatterns.abstractfactory.enums.AnimalType;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {
    @Override
    public AnimalType getType() {
        return AnimalType.TIGER;
    }

    @Override
    public String makeNoise() {
        return "Tiger Roar!";
    }
}
