package com.company;

public class TestRobot {

    public static void main(String[] args) {
	// write your code here
        Robot robot = new Robot(0,0,100);



                for(int k = 0; k < 4; k++){
                    robot.go_up();

                }

                for(int j =0; j < 6; j++){
                    robot.go_right();
                }
                for(int m = 0; m < 2; m++){
                    robot.go_down();
                }




      /*  robot.go_up();
        robot.go_up();
        robot.go_up();
        robot.go_up();
        robot.go_right();
        robot.go_right();
        robot.go_right();
        robot.go_right();
        robot.go_right();
        robot.go_right();
        robot.go_up();
        robot.go_up();*/
    }
}
