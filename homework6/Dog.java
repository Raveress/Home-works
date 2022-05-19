package homework6;

public class Dog extends Animal{
    private static int count;

    public Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++;
    }

    public static int getCount(){
        return count;
    }

}
