package com.company;

 abstract class Vehicle {
    private char fuelType;
    private String serialNumber;

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public  void accelerate(){
        System.out.println("Vehicle is accelerating…");
    }
    public void applyBreaks(){
        System.out.println("Vehicle is breaking…");
    }
    public abstract void reverse();

    public Vehicle(char fuelType, String serialNumber) {
        this.fuelType = fuelType;
        this.serialNumber = serialNumber;
    }

}
