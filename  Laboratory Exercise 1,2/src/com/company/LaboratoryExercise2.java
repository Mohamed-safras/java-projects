package com.company;

import java.util.Scanner;

public class LaboratoryExercise2 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        num1 = input.nextInt();
        System.out.println("Enter an integer number:");
        num2 = input.nextInt();
        System.out.println("Enter an integer number:");
        num3 = input.nextInt();
        System.out.println("Enter an integer number:");
        num4 = input.nextInt();
        System.out.println("Enter an integer number:");
        num5 = input.nextInt();

        double total = num1+num2+num3+num4+num5;
        double average = total/5;
        System.out.println("The average is"+average);

        int integerValue = (int)total/5;

        String stringValue = String.valueOf(integerValue);

        int sn = Integer.parseInt(stringValue + stringValue);

        System.out.println("The value is "+(integerValue+sn/integerValue));
    }
}
