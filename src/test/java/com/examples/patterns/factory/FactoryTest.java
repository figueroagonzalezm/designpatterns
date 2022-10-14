package com.examples.patterns.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class FactoryTest {
    @Autowired
    AnimalFactory animalFactory;

    @Test
    public void testFactory(){
        Animal cat = animalFactory.getAnimal(AnimalType.CAT);
        Animal dog = animalFactory.getAnimal(AnimalType.DOG);

        assertThat(cat.getType()).isEqualTo(AnimalType.CAT);
        assertThat(dog.getType()).isEqualTo(AnimalType.DOG);

    }
}
