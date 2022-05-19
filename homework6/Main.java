package homework6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Мурзик", 100,0);
        animals[1] = new Cat("Барсик", 200,0);
        animals[2] = new Dog("Шарик", 400,5);
        animals[3] = new Dog("Полкан", 250,7);

        System.out.println("Характеристики животных");
        System.out.println("--------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println();

        System.out.println("Бег: ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);

        }
        System.out.println();
        System.out.println("Плавание: ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(5);

        }

        System.out.println();
        System.out.println("Всего собак создано: " + Dog.getCount());
        System.out.println("Всего котов создано: " + Cat.getCount());
        }


}
