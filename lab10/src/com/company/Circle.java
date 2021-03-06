package com.company;

public class Circle extends Shape {

    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String colour){
        super(colour);
        this.radius = radius;
    }

    @Override
    public double  getPerimeter(){

        return (2*Math.PI*radius);
    }

    @Override
    public double getArea() {
        return (Math.PI*radius*radius);
    }

}
