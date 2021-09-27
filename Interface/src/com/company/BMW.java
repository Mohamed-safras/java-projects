package com.company;

public class BMW implements Vehicle,Car{
    @Override
    public void Break() {
        System.out.println("BMW is Breaking");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW is accelerating");
    }
    @Override
    public void speed(){
        System.out.println("BMW has gone in 150Km/h");
    }
}
