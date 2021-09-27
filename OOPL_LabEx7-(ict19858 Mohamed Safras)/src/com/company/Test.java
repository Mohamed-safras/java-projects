package com.company;


import java.util.Arrays;

import java.util.Scanner;

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

//        Circle circle1 = new Circle(10);
//        Circle circle2 = new Circle(12);
//        Circle circle3 = new Circle(14);
//        Circle circle4 = new Circle(16);
//        Circle circle5 = new Circle(18);
//
//        Circle[] circle =new Circle[]{circle1,circle2,circle3,circle4,circle5};
//
//        for (Circle value : circle) {
//            value.setRadius(value.getRadius() * 1.4);
//            System.out.println(value.getRadius());
//        }
//        System.out.println("---------------------------------------------");
//        float tot = 0;
//
//        for (Circle averages : circle ){
//            tot+=averages.getRadius();
//        }
//        System.out.println("Average radius :"+tot/circle.length);
//        System.out.println("---------------------------------------------");

        
//        int [] gas = new int[]{10,20,30,40,50};
//        int gasTotal = 0;
//
//        for(int i = 0 ; i < gas.length; i++){
//            gasTotal+=gas[i];
//        }
//        System.out.println("your total : "+gasTotal);
//        if (gasTotal > 100){
//            System.out.println("you are spend too much");
//            return  ;
//        }
//        else {
//            System.out.println("you are good");
//            return ;
//        }

//        long i = 1023222333;
//        String l = String.valueOf(i);
//        int m = Integer.parseInt(l);
       // System.out.println(m);


//        String s = "5.5f";
//        boolean a = Boolean.parseBoolean(s.toUpperCase());
//
//        System.out.println(a);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("ENTER YOUR GRADE : ");
//        char grade = scanner.next().charAt(0);
//        grade = Character.toUpperCase(grade);
//
//        switch (grade){
//            case 'A':
//                System.out.println("your grade is "+grade+". so,you are Excellent");
//                break;
//            default:
//                System.out.println("invalid");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input : ");
        String string = scanner.nextLine();

        char [] arr = new char[string.length()];

        String reverse = "";

        int letter = 0;

        for ( int i = string.length() -1; i >= 0 ; i--){
            arr[letter] = string.charAt(i);
            letter++;

        }
        for ( int i = 0; i < string.length() ; i++ ){
            reverse+=arr[i];
        }
        System.out.println(reverse);
    }

}
