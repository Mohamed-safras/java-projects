package com.company;

public class Test {

    public static void main(String[] args) {

        Rectangle rectangle1 = new  Rectangle(5,4,"purple");
        Circle circle1 = new Circle(7.0,"white");


        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());

        System.out.println();

        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());



        Circle circle2 = new Circle(3.5,"red");
        Rectangle rectangle2 = new  Rectangle(4,5,"yellow");
        Circle circle3 = new Circle(10.5,"green");
        Rectangle rectangle3 = new  Rectangle(5.556,2,"blue");

        Shape [] shapes = new Shape[]{circle2,circle3,rectangle2,rectangle3};

        for (Shape i : shapes){

            System.out.println();
            System.out.println(i.getArea());

            System.out.println(i.getPerimeter());
        }

    }
}
