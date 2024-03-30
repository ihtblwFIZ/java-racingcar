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

    // 자동차 이름 반환
    public String getCarName() {
        return name.name();
    }

    // 자동차 위치 반환
    public int getCarPosition() {
        return position.getPosition();
    }

    // 자동차 전진
    public void moveCar(int number) {
        if (number >= MINIMUM_MOVE_POWER) {
            position.increasePosition();
        }
    }
}
