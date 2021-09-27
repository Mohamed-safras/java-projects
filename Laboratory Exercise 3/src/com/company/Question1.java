package com.company;

//import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Mohamed Safras");
        student.setAge(21);
        student.sayName(student.getName(),student.getAge());

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        double mark = sc.nextDouble();
        char grade;

        if(mark<=100 && mark>=75){
            grade = 'A';
            System.out.println("Your grade is :"+grade);
        }
        else if(mark>=60 && mark <=74){
            grade ='B';
            System.out.println("Your grade is :"+grade);
        }
        else if(mark>=45 && mark <=59){
            grade ='C';
            System.out.println("Your grade is :"+grade);
        }
        else if(mark>=35 && mark <=44){
            grade ='D';
            System.out.println("Your grade is :"+grade);
        }
        else if(mark>=0 && mark <=34){
            grade ='F';
            System.out.println("Your grade is :"+grade);
        }
        else{
            grade = 'I';
            System.out.println("Your grade is :"+grade);
        }*/
    }


}
