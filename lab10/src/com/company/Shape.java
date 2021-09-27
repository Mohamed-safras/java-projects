package com.company;

 abstract class Shape {

    private String colour;
    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public Shape(String colour) {
         this.colour = colour;
    }

    public abstract double  getPerimeter();

    public abstract double getArea();


}
