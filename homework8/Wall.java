package homework8;

public class Wall extends Obstacles {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена " + super.getName() + "высотой: " + this.height);

        actions.jump();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("Прыжок удался!");
            return true;
        }else {
            System.out.println("Прыжок не удался!");
            return false;
        }

    }
}
