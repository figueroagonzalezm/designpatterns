package com.examples.patterns.abstractfactory;

import com.examples.patterns.abstractfactory.enums.AnimalType;

public interface Animal {
    AnimalType getType();
    String makeNoise();
}