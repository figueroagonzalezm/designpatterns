package com.examples.patterns.abstractfactory;

import com.examples.patterns.abstractfactory.enums.AnimalGroup;
import com.examples.patterns.abstractfactory.enums.AnimalType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AbstractFactoryTest {

    @Autowired
    AnimalFactoryProducer animalFactoryProducer;

    @Test
    public void testAbstractFactory() {
        AnimalFactory petFactory = animalFactoryProducer.getAnimalFactory(AnimalGroup.PET);
        AnimalFactory wildFactory = animalFactoryProducer.getAnimalFactory(AnimalGroup.WILD);

        Animal canary = petFactory.getAnimal(AnimalType.CANARY);
        Animal lion = wildFactory.getAnimal(AnimalType.LION);

        assertThat(lion.getType()).isEqualTo(AnimalType.LION);
        assertThat(canary.getType()).isEqualTo(AnimalType.CANARY);

    }
}
