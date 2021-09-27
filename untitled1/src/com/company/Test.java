package com.company;


import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        //Q1/01
        //  increment the values of all the elements by 1.
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] += 1);
        }
        System.out.println("---------------------------------------------");

        // values of the array in the reverse order.
        int total = 0 ;

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
        System.out.println("---------------------------------------------");

        for (int array:intArray){
            total+=array;
        }
        Arrays.sort(intArray);
        System.out.println("total :"+total);
        System.out.println("average :"+total/intArray.length);
        System.out.println("maximum :"+intArray[intArray.length-1]);
        System.out.println("minimum :"+intArray[0]);

        System.out.println("---------------------------------------------");

        //Q1/02


        String []stringArray = new String[]{"natasha  ","tony","peter","adam","john","james"};
        for (String s : stringArray) {
            System.out.println(s.trim());
        }
        System.out.println("---------------------------------------------");
        StringBuilder allNames = new StringBuilder();
        for (String name : stringArray){
            allNames.append(name.trim());
        }
        System.out.println(allNames);
        System.out.println("---------------------------------------------");
        String firstPart = allNames.substring(0,allNames.length()/2);
        String secondPart = allNames.substring(allNames.length()/2);
        System.out.println("This is first part :"+firstPart);
        System.out.println("This is second part :"+secondPart);
        System.out.println("Is the first part equal to second part :"+firstPart.equals(secondPart));
        System.out.println("Uppercase :"+firstPart.toUpperCase());
        System.out.println("Lowercase :"+secondPart.toLowerCase());
        System.out.println("---------------------------------------------");

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(12);
        Circle circle3 = new Circle(14);
        Circle circle4 = new Circle(16);
        Circle circle5 = new Circle(18);

        Circle[] circle =new Circle[]{circle1,circle2,circle3,circle4,circle5};

        for (Circle value : circle) {
            value.setRadius(value.getRadius() * 1.4);
            System.out.println(value.getRadius());
        }
        System.out.println("---------------------------------------------");
        float tot = 0;

        for (Circle averages : circle ){
            tot+=averages.getRadius();
        }
        System.out.println("Average radius :"+tot/circle.length);
        System.out.println("---------------------------------------------");
    }

}

