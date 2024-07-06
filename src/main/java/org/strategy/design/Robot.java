package org.strategy.design;

public class Robot {

    private Robot robot;

    public Robot(Robot robot) {
        this.robot = robot;
    }

    public Robot() {

    }

    public void setRobot(Robot robot) {

    }

    public void move(){
        robot.move();
    }

    public void setBehaviour(Behaviour standard) {
    }
}
