package com.examples.patterns.abstractfactory;

import com.examples.patterns.abstractfactory.enums.AnimalType;

public interface AnimalFactory {
    public Animal getAnimal(AnimalType animalType);
}
