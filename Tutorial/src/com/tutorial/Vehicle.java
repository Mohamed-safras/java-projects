package com.tutorial;

public class Vehicle {
    private int noOfwheels;
    private double speed;
    private String colour;

    public int getWheelsCount() {
        return noOfwheels;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public void setNoOfwheels(int noOfwheels) {
        this.noOfwheels = noOfwheels;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getVehicleType() {
        switch (noOfwheels) {
            case 1:
                return "Monocycle";
            case 2:
                return "Bicycle";
            case 3:
                return "Three wheeler";
            case 4:
                return "Four wheeler";
            case 6:
                return "Six wheeler";
            default:
                return "Other vehicle";
        }
    }
}