package main.com.hillel.domin.homework.homework2.version2;

public class Dog extends Animal {

    private String nameDog;
    private int runDog;
    private int swimDog;
    private int distanceRunDog = 500;
    private int distanceSwimDog = 10;
    private static int count;

    public Dog(String nameDog, int runDog, int swimDog) {
        this.nameDog = nameDog;
        this.runDog = runDog;
        this.swimDog = swimDog;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    void run() {
        if (runDog >= distanceRunDog ) {
            System.out.println(nameDog + " running " + distanceRunDog + " metrs");
        }else{
            System.out.println(nameDog + " can't run that long");
        }
    }

    @Override
    void swim() {
        if (swimDog >= distanceSwimDog ) {
            System.out.println(nameDog + " swimming " + distanceSwimDog + " metrs");
        }else{
            System.out.println(nameDog + "can't swimming that long");
        }
    }
}

