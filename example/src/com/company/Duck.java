package com.company;

public   class Duck extends Animal{

    public Duck(int numberOfLegs,String mainFood){
        super(numberOfLegs,mainFood);
    }

    @Override
    public void walk(){
        System.out.println("Duck Walk");
    }
    @Override
    public void talk(){
        System.out.println("Quack");
    }
}
