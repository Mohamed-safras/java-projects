package com.company;

public class Robot {
    private int x;
    private int y;
    private int batteryPower;

    public Robot(int x , int y , int batteryPower){
        this.x = x;
        this.y = y;
        this.batteryPower = batteryPower;
    }
    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getBatteryPower() {
        return batteryPower;
    }
    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
    public void go_left(){
        x-=1;
        y = y ;
        batteryPower-=1;

    }
    public void go_right(){
        x+=1;
        y = y;
        batteryPower-=1;

    }
    public void go_up(){
        x=x;
        y+=1;
        batteryPower-=1;


    }
    public void go_down(){
        x = x;
        y-=1;
        batteryPower-=1;
    }

}
