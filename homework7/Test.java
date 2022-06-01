package homework7;

import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        int action;
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Барсик", 5, false);
        allCats[1] = new Cat("Брюлик", 7, false);
        allCats[2] = new Cat("Мурзик", 55, false);

        Plate plate = new Plate(21);

        plate.printInfo();

        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].satiety < plate.getFoodCount()){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Кот " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Кот " + allCats[i].name + " не поел!");
            }

        }
        plate.printInfo();
        System.out.println("Сколько грамм корма добавить в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.printInfo();

    }
}
