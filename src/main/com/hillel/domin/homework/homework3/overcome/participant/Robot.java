package main.com.hillel.domin.homework.homework3.overcome.participant;

import main.com.hillel.domin.homework.homework3.overcome.obstacle.Obstacle;

public class Robot extends Participant implements Obstacle {



    public Robot(String name, int run1, int jump1) {
        super(name, run1, jump1);
    }


    @Override
    public void run() {
        System.out.println("Robot runing");
    }

    @Override
    public void jump() {
        System.out.println("Robot jumping");
    }


    @Override
    public void overcomeWall() {
        jump();
        int jumpRobot = 20;
        if(jumpRobot >= getJump1()){
            System.out.println("Robot " + getName() + " jumping the wall in distance: " + getJump1() + " metrs");
            System.out.println();
        }else {
            System.out.println("Robot " + getName()+ "  do not jump to " + getJump1());
            System.out.println();

        }

    }

    @Override
    public void overcomeTreadmill() {
        run();
        int runRobot = 10;
        if(runRobot >= getRun1()){
            System.out.println("Robot " + getName() + " running the treadmill in distance: " + getRun1() + " metrs");
            System.out.println();
        }else {
            System.out.println("Robot " + getName() + "  do not run to " + getRun1());
            System.out.println();

        }

    }
}
