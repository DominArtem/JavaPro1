package main.com.hillel.domin.homework.homework2.version1;

import main.com.hillel.domin.homework.homework2.version1.Animal;

public class Cat extends Animal {

    private String name;
    private final int obstacleRunCat = 200;
    private static int count;

    public Cat(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    void run() {
        System.out.println(name + " running " + obstacleRunCat + " metrs");

    }

    @Override
    void swim() {
        System.out.println("cat can't swim");

    }
}
