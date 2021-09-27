package com.Pack1;

public class Car {
    private double fuel ;//fuel left (L)
    private double totalDistance; //total distance travelled (km)

    public static double fuelRate =10;//fuel consumption rate(km/l)
    public static double maxFuel =65;//fuel tank capacity (l)
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public void travel(double distance){
        double fuelConsumption = distance/fuelRate;
        if(fuel >= fuelConsumption){
            totalDistance=totalDistance+ distance;
            fuel=fuel- fuelConsumption;

        }else{
            System.out.println("Not enough fuel in the car to travel");
        }
    }

    public void refill(){
        fuel = maxFuel;
    }
    public void refill(double amount){
            fuel=fuel + amount;
            if(fuel > maxFuel){
                fuel = maxFuel;
            }
    }
}




