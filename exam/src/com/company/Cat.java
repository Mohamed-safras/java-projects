package com.company;

 abstract class Cat extends Animal {

    public Cat(int numberOfLegs, String mainFood) {
        super();

    }

    @Override
    public void walk() {
        System.out.println("Cat walk");
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }

}
