package main.com.hillel.domin.homework.homework2.version1;

public abstract class Animal {

    private static int counter;

        public static int getCounterAnimal() {
        return counter;
    }

    public Animal(){
        counter++;
    }

    abstract void run();

    abstract void swim();



}
