package com.company;

public class Vehicle {
    public int vId;
    public String color;
    public String vName;

    public void accelerate(){
        System.out.println(vName+" is accelerate");
    }
    public void displayColor(String color){
        this.color = color;
        System.out.println("color is"+this.color);
        }

}
class Car extends Vehicle{


}