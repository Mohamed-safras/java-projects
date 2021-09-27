package com.company;

import java.sql.Array;

public class TestRectangle {

    public static void main(String[] args) {
        System.out.println("Rectangle count "+Rectangle.rectangleCount);

	    Rectangle rectangle1 = new Rectangle(10.5,10.23,"Green");
        System.out.println("The perimeter of rectangle1 is "+rectangle1.getPerimeter());
        System.out.println("The area of rectangle1 is "+rectangle1.getArea());
        System.out.println();

        System.out.println("Rectangle count "+Rectangle.rectangleCount);

        Rectangle rectangle2 = new Rectangle(15.69,89.54,"White");
        System.out.println("The perimeter of the rectangle2 is "+rectangle2.getPerimeter());
        System.out.println("The area of the rectangle2 is "+rectangle2.getArea());
        System.out.println();
        System.out.println("Rectangle count "+Rectangle.rectangleCount);

        String [] strings = {new String("weapon"),"backpack"};
        strings[1]= ("grenade").toUpperCase();
        strings[1] = strings[0].toUpperCase();
        System.out.println(strings[1]);

        double myArray [] = new double [10];
        myArray[0]= 10;
        myArray[9] = 10000;
        myArray[0] = (int)myArray[0];
        System.out.println(myArray[0]);


        char [] chars =new char[] {'A','B'};
        int Num = (int) chars[0];
        System.out.println(Num);

        int [] in =new int [] {10,101,01};
        String A = String.valueOf(in[1]);
        char B = (char)in[2];
        System.out.println(B);

    }
}
