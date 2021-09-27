package com.company;

public class Shirt {

    private String color;
    private char size;

    public Shirt(){
        System.out.println("inside constructor");
    }
    public Shirt (String color, char size){
        this.size= size;
        this.color  = color;
    }
    public Shirt (char size , String color){
        this.size = size;
        this.color = color;
    }


    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(char size){
        this.size = size;
    }
    public char getSize() {
        return size;
    }
    public  void putOn(String color){

        System.out.println("I have "+ color + " Shirt");
    }
    public  void takeOff(){

        System.out.println("My shirt size is "+ size);
    }
}
