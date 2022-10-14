package com.examples.patterns.singleton.enumtype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumSingletonTest {

    @Test
    void testEnumSingleton() {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}