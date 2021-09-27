package com.tutorial;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();

        vehicle1.setNoOfwheels(4);
        vehicle1.setColour("Brown");
        vehicle1.setSpeed(120);

        System.out.println("The vehicle type is "+vehicle1.getVehicleType());
        System.out.println("Colour of the vehicle1 is "+vehicle1.getColour());
        System.out.println("Speed of the vehicle1 is "+vehicle1.getSpeed());
    }
}
