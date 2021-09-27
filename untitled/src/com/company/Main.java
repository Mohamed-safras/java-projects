package com.company;


import java.util.Scanner;

/**
 * @author  safras
 */
public class Main {



    public static void main(String[] args) {

       Vehicle vehicle =new Vehicle();
        /*int i =1;
        do {
            System.out.println(++i);
        }while (i<10);
        */
        /*
        int D = 1 & 2;
        System.out.println(D);
        int a = 40;
        double b = 34.5;

        double c= 4;
        int d =(int) c;

        if(D == 2|| a == 2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        String y = String.valueOf(b);

        //double Z = Double.parseDouble(y);

        double X = Double.parseDouble(y);
        //System.out.println(Z);
        System.out.println(X);

        String t = "true";

        int q = 1;

        boolean s = (q == 0);
        System.out.println(b+q);

*/


        Scanner input  =new Scanner(System.in);
        System.out.println("Enter the time in seconds");
        double time = input.nextDouble();
        convertTime(time);



    }
    public static void convertTime(double time){
        int hours = (int) Math.floor(time/3600);
        double remaining_minutes =time - (hours*3600);
        int minutes = (int) Math.floor(remaining_minutes/60);
        double remaining_seconds = remaining_minutes - (minutes*60);
        int seconds = (int) Math.floor(remaining_seconds);
        int milliseconds =(int) Math.round ((remaining_seconds - seconds)*1000);

        System.out.println("The time is "+hours+"h"+" "+minutes+"m"+" "+seconds+"s"+ " "+milliseconds+"ms" );

    }
}
