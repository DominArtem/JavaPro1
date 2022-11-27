package main.com.hillel.domin.homework.homework3.square;

public class Round implements GeometricFigure{

    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    public void acreage() {
        if (radius != 0) {
            double acreage;
            System.out.println(acreage = (Math.PI * radius));
        }else{
            System.out.println("Radius do not null");
        }
    }

}
