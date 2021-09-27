package com.company;

abstract class Duck extends Animal{
    public Duck(int numberOfLegs,String mainFood){
        super();
    }

    @Override
    public void walk() {
        System.out.println("Duck walk");
    }

    @Override
    public void talk() {
        System.out.println("Quack");
    }
}
