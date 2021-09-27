package com.company;

class Car extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car Acceleration activated");
    }

    @Override
    public void Break() {
        System.out.println("Car break activated");
    }

    public Car(int numberOfWheels,String serialNumber){
        super(numberOfWheels,serialNumber);
    }
}
