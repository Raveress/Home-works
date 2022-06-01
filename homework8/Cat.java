package homework8;

public class Cat implements Actions{

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + " пробежал " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кот " + this.name + " прыгнул " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }
}
