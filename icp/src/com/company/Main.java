package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numberOfHours;
        double hourlyRate;
        double salary1=0 ;
        double salary2 = 0 ;
        double totalSalary = 0 ;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of hours : $");
        numberOfHours = input.nextDouble();

        System.out.println("Enter hourly rate : ");
        hourlyRate = input.nextDouble();

        if(numberOfHours  <= 40 && numberOfHours >= 0){
            salary1 = numberOfHours*hourlyRate*1;
            totalSalary = salary1;
            System.out.println("$ "+totalSalary);
        }
        else if(numberOfHours >= 41 && numberOfHours <=80   ){
            salary1 = 40*hourlyRate*1;
            salary2 = ((numberOfHours-40) *hourlyRate*1.25) ;
            totalSalary = salary1+salary2;
            System.out.println("$ "+totalSalary);
        }
        else {
            System.out.println("Incorrect number of hours");
        }


    }
}
