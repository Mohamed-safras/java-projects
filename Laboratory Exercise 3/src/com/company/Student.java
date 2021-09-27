package com.company;

public class Student {
     String name;
      int age;





    void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public void sayName(String name,int age){
        System.out.println("Your name is "+name + " and your age is "+age);
    }
}
