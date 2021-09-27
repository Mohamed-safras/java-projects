package com.Pack2;

public class TestShape {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Rectangle("Black",10.5,15.7);
        shapes[1] = new Triangle("Pink",7,5,3.1);
        shapes[2] = new Square(11.75,"Brown");

        double totalArea = 0;
        double averagePerimeter;
        double totalPerimeter = 0;
        double averageArea ;
        for (Shape shape : shapes) {

            totalArea += shape.getArea();

            totalPerimeter += shape.getPerimeter();

        }
        averageArea = totalArea / shapes.length;
        averagePerimeter = totalPerimeter / shapes.length;
        System.out.println("Average area : " + averageArea);
        System.out.println("Average perimeter : " + averagePerimeter);


    }
}
