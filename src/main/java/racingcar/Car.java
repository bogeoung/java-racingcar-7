package racingcar;

public class Car {

    public static final int INIT_POSITION = 0;
    public static final int MOVE_UNIT = 1;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = INIT_POSITION;
    }

    public void move() {
        this.position += MOVE_UNIT;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
