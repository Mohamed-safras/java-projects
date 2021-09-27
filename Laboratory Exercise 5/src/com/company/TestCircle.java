package com.company;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.setRadius(10.1);
        circle1.setColour("Brown");

        System.out.println("The area of circle1 is "+circle1.getPerimeter());
        System.out.println("The perimeter of circle1 is "+circle1.getArea());
        System.out.println("................................................");


        Circle circle2 = new Circle();
        circle2.setRadius(15.58);
        circle2.setColour("Pink");

        System.out.println("The perimeter of circle2 "+circle2.getPerimeter());
        System.out.println("The area of circle2 is "+circle2.getArea());
    }
}
