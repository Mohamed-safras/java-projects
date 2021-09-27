package com.company;

public class Triangle extends Shape {
    private double a,b,c;

    public Triangle(String colour, double a, double b, double c) {
        super(colour);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double perimeter ;
    @Override
    public double getPerimeter() {
        perimeter = a+b+c;
        return perimeter;
    }

    @Override
    public double getArea() {
        double s = perimeter/2;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return area;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
