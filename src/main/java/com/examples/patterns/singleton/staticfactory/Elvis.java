package com.examples.patterns.singleton.staticfactory;

// Singleton with static factory (Page 17)
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { }
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Executing Static Factory Singleton...");
    }
}
