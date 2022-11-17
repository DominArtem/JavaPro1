package main.com.hillel.domin.homework.homework1;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {


        Employee people1 = new Employee("Julli", "Vegan", "Popova", "maneger", "julli1996@com", "131233564", 26);
        Employee people2 = new Employee("Joni", "Fioletovich", "Abragimovich", "director", "directorCrut666@com", "00000000", 40);
        Employee people3 = new Employee("Denny", "Oushen", "Jahidovich", "fishman", "fishforever", "zero", 62);

        System.out.println(people1.peopleWork());
        System.out.println(people1.peopleEmail());
        System.out.println(people1.peopleTelephon());
        System.out.println();
        System.out.println(people2.peopleWork());
        System.out.println(people2.peopleEmail());
        System.out.println(people2.peopleTelephon());
        System.out.println();
        System.out.println(people3.peopleWork());
        System.out.println(people3.peopleEmail());
        System.out.println(people3.peopleTelephon());

        System.out.println();
        System.out.println();


        Car car1 = new Car("BMW");
        Car car2 = new Car("ZAZ968");
        Car car3 = new Car("Daewoo");

        car1.start();
        System.out.println();
        car2.start();
        System.out.println();
        car3.start();


    }
}
