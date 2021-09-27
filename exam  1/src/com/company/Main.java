package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(factorial(-3));


        String string = "hello";
        char [] array = new char[string.length()];

        String reverse = "";

        int letter = 0;
        for (int i = string.length() -1 ; i >=0 ; i--){
            array[letter] = string.charAt(i);
            letter++;

        }

        for ( int i = 0 ; i < string.length(); i++){
            reverse+=array[i];
        }

        System.out.println(reverse);


        int n = 5;
        int fact = n;
        while ( n > 1  ){
            n--;
            fact = fact * n;
        }
        System.out.println(fact);

    }
       /*public static long factorial(int n){

        if(n==1 || n == 0){
            return 1;
        }
        else {

            return n*factorial(n-1);
        }
       }

        */
        public static int factorial(int n){
            if ( n == 1 || n == 0){
                return 1;
            }
            else if ( n < 0 ){
                System.out.println("invalid");
                return n;
            }

            else {
                    return n*factorial(n-1);

        }
        }

        }


