package domain;

public class Car {
    // 자동차
    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public String getCarName() {
        return name.getName();
    }

    public int getCarPosition() {
        return position.getPosition();
    }
}
