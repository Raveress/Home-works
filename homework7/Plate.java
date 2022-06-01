package homework7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске " + foodCount + "г. корма";
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public void increaseFood(int catEatCount){
        foodCount += catEatCount;
    }


    public int getFoodCount() {
        return foodCount;
    }
}
