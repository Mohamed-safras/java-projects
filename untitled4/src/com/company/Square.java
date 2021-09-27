package com.company;

public class Square extends Rectangle{
    double  length;
    public Square(double height, double width, String colour,double length) {
        super(height, width, colour);
        this.length=length;
    }
}
