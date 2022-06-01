package homework8;

public class Treadmill extends Obstacles {
    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дорожка " + super.getName() + " имеет длину: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Успешно пробежал");
            return true;
        } else {
            System.out.println("Дистанция не пройдена");

            return false;
        }

    }
}
