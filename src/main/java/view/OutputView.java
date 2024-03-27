package view;

import domain.Car;

import java.util.List;

public class OutputView {
    private static final String TRY_RESULT_MESSAGE = "실행 결과";
    private static final String STATUS_MESSAGE_FORMAT = "%s : %s\n";
    private static final String POSITION_SYMBOL = "-";

    public static void printRacingResult() {
        System.out.println(TRY_RESULT_MESSAGE);
    }

    public static void printRacingStatus(List<Car> cars) {
        for (Car c: cars) {
            System.out.printf(STATUS_MESSAGE_FORMAT, c.getCarName(), getCurrentPosition(c.getCarPosition()));
        }
    }

    private static String getCurrentPosition(int position) {
        return POSITION_SYMBOL.repeat(position);
    }
}
