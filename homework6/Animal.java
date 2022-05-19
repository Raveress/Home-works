package homework6;

public class Animal {
    protected String name;
    protected int run;
    protected int swim;
    private static int count;

    public Animal(){
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String toString() {
        return "Кличка: " + name + ", Может пробежать " + run + "м. " + ", Может проплыть " + swim + "м. ";

    }

    public void run(int distance) {
        if (run >= distance){
            System.out.println(this.name + ": Успешно пробежал " + distance + "м. ");
        }else {
            System.out.println(this.name + ": Сошел с дистанции ");

        }
    }

    public void swim(int distance) {
        if (swim >= distance) {
            System.out.println(this.name + ": Успешно проплыл " + distance + "м. ");
        }else{
            System.out.println(this.name + ": Не умеет плавать! ");
        }
    }
}
