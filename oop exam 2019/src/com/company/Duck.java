package com.company;

public class Duck extends Animal {
    @Override
    public void talk() {
        System.out.println("Quack");
    }
    @Override
    public void walk(){
        System.out.println("Duck Walk");
    }
    public Duck(int numberOfLegs,String mainFood){
       super(numberOfLegs,mainFood);

    }
}
