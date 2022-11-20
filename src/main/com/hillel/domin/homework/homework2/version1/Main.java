package main.com.hillel.domin.homework.homework2.version1;

import main.com.hillel.domin.homework.homework2.version1.Animal;
import main.com.hillel.domin.homework.homework2.version1.Cat;
import main.com.hillel.domin.homework.homework2.version1.Dog;

public class Main {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Puchok");
        Dog dog = new Dog("Bobik");



        cat1.run();
        cat1.swim();
        cat2.run();
        System.out.println();
        dog.run();
        dog.swim();
        System.out.println();

        System.out.println("Number of participants: " + Animal.getCounterAnimal() + "\n" + "Number of dogs: " + Dog.getCount() + "\n" + "Number of cats: " + Cat.getCount());

    }
}
