package com.company;

 class Cat extends Animal{

    public Cat(int numberOfLegs, String mainFood) {
        super(numberOfLegs, mainFood);
    }

    @Override
    public void walk() {
        System.out.println("Cat Walk");
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }
}
