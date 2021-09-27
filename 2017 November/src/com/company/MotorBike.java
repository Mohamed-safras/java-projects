package com.company;

class MotorBike extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("MotorBike Acceleration activated");
    }

    @Override
    public void Break() {
        System.out.println("MotorBike break activated");
    }

    public MotorBike(int numberOfWheels, String serialNumber){
            super(numberOfWheels,serialNumber);
        }

}
