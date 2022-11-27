package main.com.hillel.domin.lesson.lesson2;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        Car car2 = new Car("", true,5);
        Car car3 = new Car();

        car3.setColor("Blue");


        car1.setColor("Green");
        System.out.println("Car1 " + car1.getColor());
        System.out.println("Car2 " + car2.getColor());
        System.out.println("Car3 " + car3.getColor());

        car1.movie(car1.getColor());


    }
}
