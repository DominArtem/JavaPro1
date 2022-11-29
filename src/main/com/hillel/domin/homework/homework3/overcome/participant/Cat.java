package main.com.hillel.domin.homework.homework3.overcome.participant;

import main.com.hillel.domin.homework.homework3.overcome.obstacle.Obstacle;

public class Cat extends Participant implements Obstacle {


    public Cat(String name, int run1, int jump1) {
        super(name, run1, jump1);
    }


    @Override
    public void run() {
        System.out.println("Cat runing");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping");
    }

    @Override
    public void overcomeWall() {
        jump();
        int jumpCat = 10;
        if (jumpCat >= getJump1()) {
            System.out.println("Cat " + getName() + " jumping the wall in distance: " + getJump1() + " metrs");
            System.out.println();
        } else {
            System.out.println("Cat " + getName() + " do not jump to " + getJump1());
            System.out.println();
        }

    }

    @Override
    public void overcomeTreadmill() {
        run();
        int runCat = 15;
        if (runCat >= getRun1()) {
            System.out.println("Cat " + getName() + " running the treadmill in distance: " + getRun1() + " metrs");
            System.out.println();
        } else {
            System.out.println("Cat " + getName() + "  do not run to " + getRun1());
            System.out.println();
        }
    }
}
