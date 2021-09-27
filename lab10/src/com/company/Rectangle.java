package com.company;

public class Rectangle extends Shape {

    private double height;
    private double width;

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

    public Rectangle(double height,double width,String colour) {
        super(colour);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }

    @Override
    public double getArea() {
        return height*width;
    }


}
