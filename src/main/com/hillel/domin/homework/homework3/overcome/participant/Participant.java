package main.com.hillel.domin.homework.homework3.overcome.participant;

import main.com.hillel.domin.homework.homework3.overcome.obstacle.Obstacle;

public abstract class Participant {


    private String name;
    private int run1;
    private int jump1;

    public Participant(String name, int run1, int jump1) {
        this.name = name;
        this.run1 = run1;
        this.jump1 = jump1;
    }

    public String getName() {
        return name;
    }

    public int getRun1() {
        return run1;
    }

    public int getJump1() {
        return jump1;
    }

    public abstract void run();

    public abstract void jump();
}
