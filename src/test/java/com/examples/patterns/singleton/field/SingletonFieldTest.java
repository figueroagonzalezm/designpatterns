package com.examples.patterns.singleton.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonFieldTest {

    @Test
    void testFieldSingleton() {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}