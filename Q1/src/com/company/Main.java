/*
 * ict19858
 * ITC 1141 object oriented programming laboratory
 * Question 1
 * Mohamed Safras
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String input = sc.nextLine();
        StringBuilder reverse = new StringBuilder();
        int letter = 0;

        char [] array = new char[input.length()];

        for (int i = input.length() -1; i>=0;i--){
            array[letter] = input.charAt(i);
            letter++;
        }
        for (int i = 0; i < input.length(); i++){
            reverse.append(array[i]);
        }
        System.out.println(reverse);

    }

}
