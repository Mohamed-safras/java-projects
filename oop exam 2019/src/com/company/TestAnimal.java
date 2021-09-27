package com.company;

import java.util.Scanner;

public class TestAnimal {

    public static void main(String[] args) {
	Cat cat =new Cat(4,"fish");
	Duck duck = new Duck(4,"no");
	cat.walk();
	cat.talk();
	duck.walk();
	duck.talk();

		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the time in seconds : ");
		Double time = input.nextDouble();
		int Hour = (int) Math.floor(time/3600);
		int min = (int) Math.floor((time - (Hour*3600))/60);
		int sec = (int) Math.floor((time -Hour*3600)-(min*60));
		int millisecond = (int) Math.round(((time -Hour*3600)-(min*60) - sec) * 1000);
		System.out.println("The time is "+Hour+"h"+" "+min+"m"+" "+sec+"s"+" "+millisecond+"ms");

    }
}
