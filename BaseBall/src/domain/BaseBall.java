package domain;

public class BaseBall {

    private Integer number;

    public BaseBall(Integer number) {
        this.number = number;
    }

    public static BaseBall of(Integer number) {
        return new BaseBall(number);
    }

    public int getNumber() {
        return number;
    }

}