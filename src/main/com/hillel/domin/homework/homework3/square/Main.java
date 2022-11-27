package main.com.hillel.domin.homework.homework3.square;

public class Main {

    public static void main(String[] args) {


        Round round1 = new Round(0);
        Round round2 = new Round(1);
        Round round3 = new Round(1.5);
        round1.acreage();
        round2.acreage();
        round3.acreage();
        System.out.println();
        System.out.println();

        Triangle triangle1 = new Triangle(15,3);
        Triangle triangle2 = new Triangle(0,3);
        Triangle triangle3 = new Triangle(1.5,0);
        triangle1.acreage();
        triangle2.acreage();
        triangle3.acreage();
        System.out.println();
        System.out.println();

        Square square1 = new Square(30);
        Square square2 = new Square(0);
        Square square3 = new Square(1.1);
        square1.acreage();
        square2.acreage();
        square3.acreage();
    }


}
