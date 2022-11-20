package main.com.hillel.domin.homework.homework2.version2;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik", 200, 3);

        cat1.run();
        cat1.swim();
        System.out.println();

        Dog dog1 = new Dog("Bobik", 500, 10);

        dog1.swim();
        dog1.run();
        System.out.println();

        Cat cat2 = new Cat("Puchok", 500, 330);

        cat2.swim();
        cat2.run();

        System.out.println();



        System.out.println("Participation in the competition took: " + Animal.getCounterAnimal() + "" + "\n" + "Cat: " + Cat.getCount() + "\n" + "Dog: " + Dog.getCount());



    }
}
