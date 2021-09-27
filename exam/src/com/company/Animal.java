package com.company;

 public abstract class Animal {

    private int numberOfLegs;
    private String mainFood;

    public abstract void walk();
    public abstract void talk();

    public int getNumberOfLegs(){
        return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public String getMainFood(){
        return mainFood;
    }
    public void setMainFood(String mainFood){
        this.mainFood = mainFood;
    }

    public Animal(){
        this.numberOfLegs = numberOfLegs;
        this.mainFood = mainFood;
    }
}
