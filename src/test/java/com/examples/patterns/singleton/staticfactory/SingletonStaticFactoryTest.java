package com.examples.patterns.singleton.staticfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonStaticFactoryTest {

    @Test
    void testStaticFactorySingleton() {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}