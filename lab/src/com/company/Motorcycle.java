package com.company;

public class Motorcycle extends Vehicle {

    public Motorcycle(char fuelType, String serialNumber) {
        super(fuelType, serialNumber);
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is acceleratingâ€¦");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Motorcycle is breakingâ€¦");
    }
    @Override
    public void reverse(){
        System.out.println("Motorcycle is reversingâ€¦");
    }
}
