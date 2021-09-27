package com.company;

public class Rectangle {
    private double height,width;
    private String color;
    public static int rectangleCount = 0;

    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public String getColor(){
        return color;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setColor(String color){
        this.color  = color;
    }

    public double getPerimeter(){
        return 2 * (width+height);
    }
    public double getArea(){
        return (width*height);
    }

    public Rectangle(double height,double width, String color){
        this.height = height;
        this.width = width;
        this.color = color;
        rectangleCount++;
    }
}
