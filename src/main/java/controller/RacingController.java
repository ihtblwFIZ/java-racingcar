package controller;

import domain.Cars;
import domain.TryCount;
import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.List;

public class RacingController {
    public void run() throws IOException {
        final Cars cars = new Cars(createCars());
        final TryCount tryCount = new TryCount(setTryCount());
        racingResult(tryCount, cars);
        findWinners();
    }

    // 자동차 정보 입력
    private List<String> createCars() throws IOException {
        return InputView.getCarName();
    }

    // 시도 횟수 입력
    private int setTryCount() throws IOException {
        return InputView.getTryCount();
    }

    // 시행 결과 출력
    private void racingResult(TryCount tryCount, Cars cars) {
        OutputView.printRacingResult();

        while(tryCount.isPlayable()) {
            tryCount.decreaseTryCount();
            cars.moveCars();
            OutputView.printRacingStatus(cars.getCars());
        }
    }

    // 우승자 출력
    private void findWinners() {

    }
}
