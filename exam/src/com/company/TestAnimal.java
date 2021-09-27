package com.company;

import java.sql.Array;
import java.util.Scanner;

public class TestAnimal {



    public static void main(String[] args) {
	Cat cat = new Cat(04,"fish") {
        @Override
        public void walk() {
            super.walk();
        }

        @Override
        public void talk() {
            super.talk();
        }
    };
	Duck duck = new Duck(02,"fish") {

        @Override
        public void walk() {
            super.walk();
        }

        @Override
        public void talk() {
            super.talk();
        }
    };
        cat.talk();
        cat.walk();
        duck.talk();
        duck.walk();


        System.out.println("Enter a String : ");
        Scanner string = new Scanner(System.in);
        String input = string.nextLine();
        Scanner cha = new Scanner(System.in);
        char character = cha.next().charAt(0);

       /* System.out.println("Enter a character to search : ");
        Scanner cha = new Scanner(System.in);
        char character = cha.next().charAt(0);
        char [] a  = input.toCharArray();

        int s = 0;
        for(char c : a){
            if(c == character){
                s++;
            }

        }
        System.out.println("Occurrences of the character '" + character + "' in the string: "+s);
        String str = string.nextLine();
        String [] c = str.split(" ");
        System.out.println(c);*/


    }
}
