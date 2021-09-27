package com.company;

public class Car {
    private double fuel;
    private double totalDistance;

    public double getFuel(){
        return fuel;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getTotalDistance(){
        return totalDistance;
    }
    public void setTotalDistance(double totalDistance){
        this.totalDistance = totalDistance;
    }
    public static double fuelRate = 10;
    public static double maxFuel = 65;

    public void travel(double distance){
        double fuelConsumption = distance/fuelRate;
        if(fuelConsumption == fuel){
            totalDistance+=distance;
        }
        else {
            System.out.println("not enough");
        }
    }
}
