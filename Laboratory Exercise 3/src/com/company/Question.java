package com.company;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base:");
        int base = sc.nextInt();
        System.out.println("Enter your Exponent:");
        int exponent = sc.nextInt();

        int result = 1;

        while (exponent!=0){
            result *= base;
            --exponent;
        }
        System.out.println("Answer is:"+result);
    }
}
