package com.company;

public class Dependent {
    private String dName;
    private int dAge;

    public Dependent(String dName, int dAge) {
        this.dName = dName;
        this.dAge = dAge;
    }

    public String dep(){
        this.anotherMethod();
        return (dName+" "+dAge);
    }
    public void anotherMethod(){
        System.out.println("hello");
    }
}
