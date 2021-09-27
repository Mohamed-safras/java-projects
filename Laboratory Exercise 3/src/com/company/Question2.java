package com.company;



import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        System.out.println("Enter your grade:");
        Scanner input = new Scanner(System.in);
        char grade = input.next().charAt(0);
        grade = Character.toUpperCase(grade);

        switch (grade){
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("Passed!");
                break;
            case 'F':
                System.out.println("Try again please…");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }
        /* switch statement
        switch (grade){
            case 'A' -> System.out.println("Excellent!");
            case 'B' -> System.out.println("Well done!");
            case 'C' -> System.out.println("Well done!");
            case 'D' -> System.out.println("Well done!");
            case 'F' -> System.out.println("Try again please…");
            default -> System.out.println("Invalid grade");
        }*/
        System.out.println("sajhakjdsa");
    }
}
