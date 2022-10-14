package com.examples.patterns.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;

@Component
public class AnimalFactory {
    //todo: see FactoryTest to see the behavior in action

    private EnumMap<AnimalType, Animal> animalsMap;

    @Autowired
    public AnimalFactory(List<Animal> animals) {
        this.animalsMap = new EnumMap<>(AnimalType.class);
        for (Animal animal: animals) {
            this.animalsMap.put(animal.getType(), animal);
        }
    }

    public Animal getAnimal(AnimalType animalType) {
        return this.animalsMap.get(animalType);
    }
}
