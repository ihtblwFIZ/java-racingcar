package domain;

import util.Validation;

public class Car {
    // 자동차
    private static final int MINIMUM_MOVE_POWER = 4;
    private final Name name;
    private final Position position;

    public Car(String name) {
        Validation.validationNameSize(name);
        this.name = new Name(name);
        this.position = new Position();
    }

    public String getCarName() {
        return name.getName();
    }

    public int getCarPosition() {
        return position.getPosition();
    }

    public void moveCar(int number) {
        if (number >= MINIMUM_MOVE_POWER) {
            position.increasePosition();
        }
    }
}
