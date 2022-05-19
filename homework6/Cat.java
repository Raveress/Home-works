package homework6;

public class Cat extends Animal {

private static int count;

    public Cat(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++;
    }

    public static int getCount(){
        return count;
    }
}
