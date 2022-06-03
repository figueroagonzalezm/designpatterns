package com.examples.designpatterns.abstractfactory;

import com.examples.designpatterns.abstractfactory.enums.AnimalGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.InvalidParameterException;

@Component
public class AnimalFactoryProducer {

    @Autowired
    private PetFactory petFactory;

    @Autowired
    private WildFactory wildFactory;

    public AnimalFactory getAnimalFactory(AnimalGroup group){
        switch (group){
            case WILD:
                return this.wildFactory;
            case PET:
                return this.petFactory;
            default:
                throw new InvalidParameterException("Invalid AnimalGroup: " + group);
        }
    }
}
