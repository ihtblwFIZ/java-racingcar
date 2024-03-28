package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    // 자동차 경주에 참여하는 자동차들
    private static final int DEFAULT_POSITION = 0;
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

    public List<String> findWinnerName() {
        return findWinner().stream()
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    private List<Car> findWinner() {
        int winnerPosition = getWinnerPosition();
        return cars.stream()
                .filter(car -> car.getCarPosition() == winnerPosition)
                .collect(Collectors.toList());
    }

    private int getWinnerPosition() {
        return cars.stream()
                .mapToInt(Car::getCarPosition)
                .max()
                .orElse(DEFAULT_POSITION);
    }
}
