package main.com.hillel.domin.homework.homework2.version2;

public class Cat extends Animal {

    private String name;
    private int run;
    private int swim;
    private int distanceRun = 200;
    private int distanceSwim = 0 ;
    private static int count;


    public Cat(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override

      void run() {
          if (run <= distanceRun ) {
            System.out.println(name + " running " + distanceRun + " metrs");
        }else{
            System.out.println(name + " can't run that long");
        }

}

      @Override
      void swim() {
          if (swim < distanceSwim ) {
              System.out.println(name + " swimming " + distanceSwim + " metrs");
          }else{
              System.out.println(name + " can't swim");
          }
    }




}
