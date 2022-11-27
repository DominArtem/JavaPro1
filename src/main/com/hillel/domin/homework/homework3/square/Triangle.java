package main.com.hillel.domin.homework.homework3.square;

public class Triangle implements GeometricFigure {

    private double ab;
    private double h;

    public Triangle(double ab, double h) {
        this.ab = ab;
        this.h = h;
    }

    @Override
    public void acreage() {
        if (ab != 0 && h != 0 ) {
            double acreage;
            System.out.println(acreage = (0.5 * ab * h));
        }else{
            System.out.println("Height and side do not null");
        }

    }
}
