package homework7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    public String name;
    public int satiety;
    public boolean fullness;



    public Cat(String name, int satiety, boolean fullness) {
           this.name = name;
           this.satiety = satiety;
           this.fullness = fullness;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(satiety);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
