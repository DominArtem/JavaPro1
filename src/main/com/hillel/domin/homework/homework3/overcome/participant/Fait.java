package main.com.hillel.domin.homework.homework3.overcome.participant;

import java.util.logging.SocketHandler;

public class Fait {


    public void start(Human human) {
        if (human != null) {
            human.overcomeTreadmill();
            human.overcomeWall();
        } else {
            System.out.println("Object human null");

        }
    }

    public void start1(Cat cat) {
        if (cat != null) {
            cat.overcomeTreadmill();
            cat.overcomeWall();
        } else {
            System.out.println("Object cat null");
        }
    }

    public void start2(Robot robot) {
        if (robot != null) {
            robot.overcomeTreadmill();
            robot.overcomeWall();
        } else {
            System.out.println("Object robot null");
        }
    }

}
