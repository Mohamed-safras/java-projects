package com.company;

abstract class Vehicle {
    public abstract void accelerate();
    public abstract void Break();

    int numberOfWheels;
    String serialNumber;

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    public Vehicle(int numberOfWheels,String serialNumber){
        this.numberOfWheels = numberOfWheels;
        this.serialNumber = serialNumber;
    }

}
