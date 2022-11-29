package main.com.hillel.domin.homework.homework3.overcome;

import main.com.hillel.domin.homework.homework3.overcome.obstacle.Obstacle;
import main.com.hillel.domin.homework.homework3.overcome.participant.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Human[] humans = {
                new Human("Jonni", 2, 3),
                new Human("Slavik", 2, 4),

        };

        Cat[] cat = {
                new Cat("Barsik", 40, 3),
                new Cat("Pusi", 4, 8),
                new Cat("Rozzy", 9, 1)
        };

        Robot[] robots = {
                new Robot("Junki", 7,9),
                new Robot("Frank", 1,4),
                new Robot("Danny",100,100)
        };

        Fait[] faits = {
                new Fait()
        };


        for (Human u : humans) {
            for (Fait p : faits) {
                p.start((Human) u);
            }
        }

        for (Cat j : cat) {
            for (Fait p : faits) {
                p.start1((Cat) j);
            }
        }
        for (Robot q : robots) {
            for (Fait p : faits) {
                p.start2((Robot) q);
            }
        }
    }
}


