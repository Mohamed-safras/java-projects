package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String input = sc.next();
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
        if (input.equals(reverse.toString())) System.out.println("The word is the same in reverse");
        else System.out.println("The word is not the same in reverse");

    }
}
