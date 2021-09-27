package com.company;

public class Rectangle extends Shape {
    private double height;
    private double width;
    @Override
    public double getPerimeter() {
        double perimeter = 2*(height+width);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = height*width;
        return area;
    }

    public Rectangle(double height,double width,String colour){
        super(colour);
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
