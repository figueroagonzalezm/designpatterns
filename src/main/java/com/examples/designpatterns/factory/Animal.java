package com.examples.designpatterns.factory;

public interface Animal {
    AnimalType getType();
    String makeNoise();
}