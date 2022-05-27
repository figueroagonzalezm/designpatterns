package com.examples.designpatterns.abstractfactory;

import com.examples.designpatterns.abstractfactory.enums.AnimalType;

public interface AnimalFactory {
    public Animal getAnimal(AnimalType animalType);
}
