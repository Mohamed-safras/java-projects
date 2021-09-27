package com.company;

class Stu{
    static boolean isB;
}
public class d {
    public static void main(String[] args) {
       Stu b1 = new Stu();
       Stu.isB = false;
       Stu b2 = new Stu();
       b1 = null;
        System.out.println(Stu.isB);
    }
}
