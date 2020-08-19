package domain;

public class Car {

    private final String name;
    private int position = 1;

    public Car(String name) {
        this.name = name;
    }

    /* Stream에서 사용하려고 만듬 */
    public static Car of(String name) {
        return new Car(name);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void movingOneStep(int position) {
        this.position += position;
    }

    public boolean isWinner(int maxPosition) {
        return position == maxPosition;
    }
}
