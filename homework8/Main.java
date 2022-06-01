package homework8;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(15);
        int height = rand.nextInt(21);
        actions[0] = new Human("Василий", distance, height);

        distance = rand.nextInt(7);
        height = rand.nextInt(28);
        actions[1] = new Cat("Барсик", distance, height);

        distance = rand.nextInt(18);
        height = rand.nextInt(29);
        actions[2] = new Robot("Мегатрон", distance, height);

        Obstacles[] obstacles = new Obstacles[10];

        boolean isRoad;

        for (int i = 0; i < obstacles.length; i++) {
            distance = rand.nextInt(15);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                obstacles[i] = new Treadmill("Беговая дорожка " + i, distance);
            } else {
                obstacles[i] = new Wall("Стена " + i, distance);
            }

        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {

                result = obstacles[j].moving(actions[i]);

                if (!result) {
                    break;
                }

            }
            if (result) {
                System.out.println("Успешно!!");
            } else {
                System.out.println("Сошел с полосы препятствий");
            }

        }


    }
}
