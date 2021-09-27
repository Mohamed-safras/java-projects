package com.company;

public class Robot {
    private int x,y,batterPower;
    public Robot (int x, int y ,int batterPower){
        this.x =x;
        this.y = y;
        this.batterPower = batterPower;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBatterPower() {
        return batterPower;
    }

    public void setBatterPower(int batterPower) {
        this.batterPower = batterPower;
    }

    public void go_left(){
        x -=1;
        batterPower-=1;
        System.out.println(x +","+y);
        System.out.println(batterPower);
    }
    public void go_right(){
        x +=1;
        batterPower-=1;
        System.out.println(x +","+y);
        System.out.println(batterPower);
    }
    public void go_up(){
        y +=1;
        batterPower-=1;

       System.out.println(x +","+y);
       System.out.println(batterPower);
    }
    public void go_down(){
        y -=y;
        batterPower-=1;
       System.out.println(x +","+y);
        System.out.println(batterPower);
    }


}
