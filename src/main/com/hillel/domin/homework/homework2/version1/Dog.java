package main.com.hillel.domin.homework.homework2.version1;

import main.com.hillel.domin.homework.homework2.version1.Animal;

public class Dog extends Animal {

    private final int obstacleRunDog = 200;
    private final int swimDog = 10;
    private String name;
    private static int count;



    public static int getCount() {
        return count;
    }

    public Dog(String name) {
        this.name = name;
        count++;
    }



    @Override
    void run() {
        System.out.println(name + " running " + obstacleRunDog + " metrs");

    }

    @Override
    void swim() {
        System.out.println(name + " swimming " + swimDog + " metrs");


    }
}
