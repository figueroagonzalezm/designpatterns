package com.examples.designpatterns.abstractfactory;

import com.examples.designpatterns.abstractfactory.animals.Hamster;
import com.examples.designpatterns.abstractfactory.animals.Canary;
import com.examples.designpatterns.abstractfactory.enums.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.InvalidParameterException;

@Component
public class PetFactory implements AnimalFactory {

    @Autowired
    Hamster hamster;
    @Autowired
    Canary canary;

    public Animal getAnimal(AnimalType animalType) {
        switch (animalType){
            case CANARY:
                return this.canary;
            case HAMSTER:
                return this.hamster;
            default:
                throw new InvalidParameterException("Incorrect AnimalType: "+ animalType);
        }
    }
}
