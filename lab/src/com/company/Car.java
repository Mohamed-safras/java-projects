package com.company;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(char fuelType, String serialNumber,int numberOfDoors) {
        super(fuelType, serialNumber);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void reverse() {
        System.out.println("car is reversing…");
    }
}
