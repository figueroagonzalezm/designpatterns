package com.examples.designpatterns.abstractfactory;

import com.examples.designpatterns.abstractfactory.enums.AnimalType;

public interface Animal {
    AnimalType getType();
    String makeNoise();
}