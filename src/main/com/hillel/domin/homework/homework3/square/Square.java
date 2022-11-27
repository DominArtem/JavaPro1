package main.com.hillel.domin.homework.homework3.square;

public class Square implements GeometricFigure{

    private double ac;

    public Square(double ac) {
        this.ac = ac;
    }

    @Override
    public void acreage() {
        if (ac != 0) {
            double acreage;
            System.out.println(acreage = (ac * ac));
        }else{
            System.out.println("Side do not null");
        }


    }
}
