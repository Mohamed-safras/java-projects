package com.company;

public class Car {
    private char transmissionType,fuelType;
    private double topSpeed;
    private int numberOfDoors = 4;
    private String serialNumber;

    public char getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(char transmissionType) {
        this.transmissionType = transmissionType;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Car(){
         numberOfDoors = 4;
    }
    public Car(char transmissionType,char fuelType,double topSpeed,int numberOfDoors,String serialNumber){
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.topSpeed = topSpeed;
        this.serialNumber = serialNumber;
        this.numberOfDoors = numberOfDoors;
    }

    public Car(char transmissionType, char fuelType) {
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
    }

    public Car(char transmissionType, char fuelType, String serialNumber) {
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.serialNumber = serialNumber;
    }

    public Car(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void displayDetails(){
        System.out.println("Transmission Type :"+transmissionType);
        System.out.println("Fuel Type :"+fuelType);
        System.out.println("Top Speed :"+topSpeed);
        System.out.println("Number of Doors :"+numberOfDoors);
        System.out.println("Serial Number :"+serialNumber);
    }
}
