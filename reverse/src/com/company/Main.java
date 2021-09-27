package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word : ");
        String words = input.nextLine();

        char[] a = new char[words.length()];
        StringBuilder reverse = new StringBuilder();
        int letter =0;

        for (int i = words.length()-1 ; i >=0;i--){
            a[letter] = words.charAt(i);
            letter++;
        }

        for(int j = 0; j < words.length(); j++){
            reverse.append(a[j]);
        }

        if(words.equals(reverse.toString())){
            System.out.println("The word is the same in reverse");
        }else {
            System.out.println("The word is not the same in reverse");
        }
        System.out.println("the word in revere is : " + reverse);
    }
}
