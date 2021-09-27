package com.company;

public class Car {
    private double fuel,totalDistance;
    public static double fuelRate = 10,maxFuel=65;

    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return fuel;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }
    public void travel(double distance){
        double fuelConsumption = distance/fuelRate;
        if(fuelConsumption<=fuel){
            double total = distance+totalDistance;
            double fuelLeft = fuel-fuelConsumption;
            System.out.println("total distance : "+total);
            System.out.println("fuel left : "+fuelLeft);
        }
        else {
            System.out.println("Not enough fuel in the car to travel");
        }
    }
    public void refill(){
        fuel = maxFuel;
    }
    public void refill(double amount){
        double a = amount+fuel;
        if(fuel>maxFuel){
            fuel=maxFuel;
        }
    }
}
