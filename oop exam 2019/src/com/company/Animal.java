package com.company;

abstract class Animal {
    public abstract void walk();
    public abstract void talk();

    int numberOfLegs;
    String mainFood;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getMainFood() {
        return mainFood;
    }

    public void setMainFood(String mainFood) {
        this.mainFood = mainFood;
    }

    public Animal(int numberOfLegs,String mainFood){
        this.numberOfLegs = numberOfLegs;
        this.mainFood = mainFood;
    }
}
