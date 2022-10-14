package com.examples.patterns.abstractfactory;

import com.examples.patterns.abstractfactory.animals.Lion;
import com.examples.patterns.abstractfactory.animals.Tiger;
import com.examples.patterns.abstractfactory.enums.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.InvalidParameterException;

@Component
public class WildFactory implements AnimalFactory{

    @Autowired
    Tiger tiger;
    @Autowired
    Lion lion;

    public Animal getAnimal(AnimalType animalType) {
        switch (animalType){
            case TIGER:
                return this.tiger;
            case LION:
                return this.lion;
            default:
                throw new InvalidParameterException();
        }
    }
}
