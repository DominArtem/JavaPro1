package main.com.hillel.domin.homework.homework2.version2;

public abstract class Animal {

    private static int counter;

    public static int getCounterAnimal() {
        return counter;
    }

    public Animal(){
        counter++;
    }

//    public void run(int distanceRun, String name){
//        if (run > distanceRun ) {
//            System.out.println(name + " running " + distanceRun + "metrs");
//        }else{
//            System.out.println(name + "can't run that long");
//        }
//    }
//
//   public void swim(int distanceSwim, String name){
//       if (swim > distanceSwim ) {
//           System.out.println(name + " swimming " + distanceSwim + "metrs");
//       }else{
//           System.out.println(name + "can't swim that long");
//       }
//   }

    abstract void run();

    abstract void swim();


    }

