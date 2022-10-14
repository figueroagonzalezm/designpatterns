package com.examples.patterns.singleton.enumtype;

// Enum singleton - the preferred approach (Page 18)
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Executing enum singleton...");
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
