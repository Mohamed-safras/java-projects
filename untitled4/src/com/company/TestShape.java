package com.company;

import java.sql.Array;

public class TestShape {

    public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(10.5,15.7,"black");
    Triangle triangle = new Triangle("Pink",7,5,3.1);
    Square square = new Square(11.75,11.75,"Brown",11.75);

	Shape [] shapes = new Shape[]{rectangle,triangle,square};

	double totalPerimeter = 0.0;
	double averagePerimeter = 0.0;
    double totalArea = 0.0;
    double averageArea = 0.0;
    for (int i=0;i<shapes.length;i++){
        totalPerimeter+=shapes[i].getPerimeter();
    }
    for (int i = 0; i < shapes.length; i++){
        totalArea+=shapes[i].getArea();
    }

    averagePerimeter = totalPerimeter/ shapes.length;
    averageArea=totalArea/ shapes.length;
    System.out.println("The average perimeter is : "+averagePerimeter);
    System.out.println("The average Area is : "+averageArea);

 }
}
