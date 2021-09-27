package com.company;

public class Main {

    public static void main(String[] args) {

	Shirt shirt = new Shirt('S',"Blue");
    Shirt shirt1 = new Shirt("White",'L');


	shirt1.setColor("red");
	shirt1.setSize('L');

	shirt.putOn("white");
	shirt.takeOff();

	System.out.println(shirt1.getColor());
	System.out.println(shirt1.getSize());

      

    }
}
