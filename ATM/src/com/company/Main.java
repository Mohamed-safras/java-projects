package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double withdraw;
	double accountBalance;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your withdraw amount : ");
        withdraw = input.nextDouble();
        System.out.println("Enter your account balance : ");
        accountBalance = input.nextDouble();
        double bankCharge = 0.5;

        if(withdraw%5==0){
            if(withdraw < accountBalance){
                accountBalance = accountBalance - (withdraw+bankCharge);
                System.out.println(accountBalance);
            }
            else {
                System.out.println("Insufficient Funds!,Your withdraw amount is greater than account balance and your account balance is : "+accountBalance);
            }
        }
        else {
            System.out.println(accountBalance);
        }
    }
}
