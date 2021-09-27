package com.company;

public class TestVehicle {

    public static void main(String[] args) {
	    Car car = new Car(04,"ASWS112");
	    MotorBike motorBike = new MotorBike(2,"DASAD3232");

	    car.accelerate();
	    car.Break();
	    motorBike.accelerate();
	    motorBike.Break();
    }
}
