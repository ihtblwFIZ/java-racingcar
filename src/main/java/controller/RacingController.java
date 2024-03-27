package controller;

import domain.Cars;
import domain.TryCount;
import view.InputView;

import java.io.IOException;
import java.util.List;

public class RacingController {
    public void run() throws IOException {
        final Cars Cars = new Cars(createCars());
        final TryCount tryCount = new TryCount(setTryCount());
        racingResult();
        findWinners();
    }

    //
    private List<String> createCars() throws IOException {
        return InputView.getCarName();
    }

    private int setTryCount() throws IOException {
        return InputView.getTryCount();
    }

    private void racingResult() {

    }

    private void findWinners() {

    }
}
