package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    // 자동차 경주에 참여하는 자동차들
    private List<Car> cars;
    public Cars(List<String> carNames) {
        cars = new ArrayList<>();
    }

    private void generateCars(List<String> carNames, List<Car> cars) {
        for(String name: carNames) {
            Car car = new Car(name);
            cars.add(car);
        }
    }
}
