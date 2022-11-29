package main.com.hillel.domin.homework.homework3.overcome.participant;

import main.com.hillel.domin.homework.homework3.overcome.obstacle.Obstacle;

public class Human  extends Participant implements Obstacle {


    public Human(String name, int run1, int jump1) {
        super(name, run1, jump1);
    }


    @Override
    public void run() {
        System.out.println("Human " + getName() + " runing" );
    }

    @Override
    public void jump() {
        System.out.println("Human " + getName() + " jumping");
    }

    @Override
    public void overcomeWall() {
        jump();
        int jumpHuman = 5;
        if(jumpHuman >= getJump1()){
            System.out.println("Human " + getName() + " jumping the wall in distance: " + getJump1() + " metrs");
        }else {
            System.out.println("Humen lox do not jump to " + getJump1());
        }

    }

    @Override
    public void overcomeTreadmill() {
        run();
        int runHuman = 40;
        if(runHuman >= getRun1()){
            System.out.println("Human " + getName() + " running the treadmill in distance: " + getRun1() + " metrs");
            System.out.println();
        }else {
            System.out.println("Humen lox do not run to " + getRun1());
            System.out.println();

        }
    }


}
