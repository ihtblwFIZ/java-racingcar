package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    // 자동차 경주에 참여하는 자동차들
    private final List<Car> cars;
    public Cars(List<String> carNames) {
        cars = new ArrayList<>();
        generateCars(carNames, cars);
    }

    private void generateCars(List<String> carNames, List<Car> cars) {
        for(String name: carNames) {
            Car car = new Car(name);
            cars.add(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void moveCars() {
        for (Car c: cars) {
            int number = RandomNumber.getRandomNumber();
            c.moveCar(number);
        }
    }
}
