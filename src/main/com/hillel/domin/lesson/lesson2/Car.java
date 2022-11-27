package main.com.hillel.domin.lesson.lesson2;

public class Car {
    private String color;
    private boolean isExpensive;
    private int doors;
    private String brend;

    public Car(String color, boolean isExpensive, int doors) {
        this.color = color;
        this.isExpensive = isExpensive;
        this.doors = doors;
    }

    public Car() {

    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getColor() {
        if (color.isEmpty()){
            return  "GREEN";

        }
        return color.toUpperCase();
    }

    public void setColor(String color) {
        if (color.isEmpty()){
            this.color = "Green";
            System.out.println();
        } else{
        this.color = color;
    }
    }

    public boolean isExpensive() {
        return isExpensive;
    }

    public void setExpensive(boolean expensive) {
        isExpensive = expensive;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void movie(String color){
        if(color.equals("Green")){
            System.out.println("Car is moving in West");
            }
        System.out.println("Car is moving in est");

        }

        public String brendCar (String color, String brend) {
            if (color.equals("red") && brend.equals("Bugatti")) {
                String result1 = "drive";
                return result1;
            } else if (color.equals("blue") && brend.equals("Ferrari")) {
                String result2 = "drive crash";
                return result2;
            }
            return "www";
        }
    }

