package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
try {
    Scanner input = new Scanner(System.in);
        double widthdraw = input.nextDouble();
        double change = 0.5;
        double balance = 120.0;
       
            if(widthdraw %5 ==0 && balance >=  (widthdraw+change)) {
                
                    balance-=widthdraw+change;
                
            }
            System.out.printf("%.2f",balance);
} catch (Exception e) {
    return;
}
        
        }

        
    }

