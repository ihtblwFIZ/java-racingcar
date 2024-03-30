package domain;

import util.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    // 자동차 경주에 참여하는 자동차들
    private static final int DEFAULT_POSITION = 0;
    private final List<Car> cars;
    public Cars(List<String> carNames) {
        Validation.validationCarNumber(carNames);
        Validation.validationDuplicatedName(carNames);

        cars = new ArrayList<>();
        generateCars(carNames, cars);
    }

    // 자동차 생성
    private void generateCars(List<String> carNames, List<Car> cars) {
        for(String name: carNames) {
            Car car = new Car(name);
            cars.add(car);
        }
    }

    // 자동차 리스트 반환
    public List<Car> getCars() {
        return cars;
    }

    // 자동차 전진
    public void moveCars() {
        for (Car c: cars) {
            int number = RandomNumber.getRandomNumber();
            c.moveCar(number);
        }
    }

    // 우승자 이름 반환
    public List<String> findWinnerName() {
        return findWinner().stream()
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    // 우승자 반환
    private List<Car> findWinner() {
        int winnerPosition = getWinnerPosition();
        return cars.stream()
                .filter(car -> car.getCarPosition() == winnerPosition)
                .collect(Collectors.toList());
    }

    // 우승자 위치 반환
    private int getWinnerPosition() {
        return cars.stream()
                .mapToInt(Car::getCarPosition)
                .max()
                .orElse(DEFAULT_POSITION);
    }
}
