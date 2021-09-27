package com.company;

public class Test {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car('A','F',250,4,"ABCSH42875387");
        Car car3 = new Car('A','F');
        Car car4 = new Car('M','F',"ABCSH42875388");
        Car car5 = new Car("ABCSH42875389");

        car1.displayDetails();
        System.out.println("-----------------------------------");
        car2.displayDetails();
        System.out.println("-----------------------------------");
        car3.displayDetails();
        System.out.println("-----------------------------------");
        car4.displayDetails();
        System.out.println("-----------------------------------");
        car5.displayDetails();
    }


}
