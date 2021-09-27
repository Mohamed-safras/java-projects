package com.company;

public class Circle {
    private double radius;
    private String colour;

    public double getRadius(){
        return radius;
    }
    public String getColour(){
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }


}
