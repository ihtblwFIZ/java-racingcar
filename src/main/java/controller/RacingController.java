package controller;

import domain.Cars;
import view.InputView;

import java.io.IOException;
import java.util.List;

public class RacingController {
    public void run() throws IOException {
        final Cars Cars = new Cars(initializeCar());
        setRacingCount();
        racingResult();
        printWinner();
    }

    private List<String> initializeCar() throws IOException {
        return InputView.getCarName();
    }

    private void setRacingCount() {

    }

    private void racingResult() {

    }

    private void printWinner() {

    }
}
