package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter First number of the range :");
        int num1 = input.nextInt();
        System.out.println("Enter second number of the range :");
        int num2 = input.nextInt();
        int sum =0;
        int sub = num2-num1;
        float avg = 0;
        if(num1<num2){
            while (num1 <= num2){
                sum = sum+num1;
                avg =(float) sum/(sub+1);
                num1++;
            }
            System.out.println(sum);
            System.out.println(avg);
        }
        else {
            System.out.println("First number should be smaller than the second number");
        }
    }
}
