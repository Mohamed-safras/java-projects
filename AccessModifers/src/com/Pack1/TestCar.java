package com.Pack1;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {


        Car car = new Car();


        car.travel(40.5);
        car.refill();
        car.travel(137.5);
        car.refill(75);

        System.out.println("Total Distance Traveled : "+car.getTotalDistance());
        System.out.println("Fuel Left : "+ car.getFuel());

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        if(number < 0){
            System.out.println("can not find factorial of an negative number");
        }else{
            System.out.println(factorial(number));
        }

    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }*/
    }
}