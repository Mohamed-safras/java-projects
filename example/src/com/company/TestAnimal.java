package com.company;

public class TestAnimal {

    public static void main(String[] args) {
	    Cat cat = new Cat(4,"fish");


	    Duck duck = new Duck(2,"fish");

	    cat.walk();
		cat.talk();

		System.out.println("----------------------");

		duck.walk();
	    duck.talk();
    }
}
