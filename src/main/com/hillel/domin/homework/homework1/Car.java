package main.com.hillel.domin.homework.homework1;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void start(){

        startElectricity();
        startCommand();
        startFuelSystem();


    }

    private void startElectricity(){
        System.out.println(name + " start electricity...");
    }

    private void startCommand(){
        System.out.println(name + " start command...");
    }

    private void startFuelSystem(){
        System.out.println(name + " start fuel system...");
    }

}
