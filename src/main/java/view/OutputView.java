package view;

import domain.Car;

import java.util.List;

public class OutputView {
    private static final String TRY_RESULT_MESSAGE = "실행 결과";
    private static final String STATUS_MESSAGE_FORMAT = "%s : %s\n";
    private static final String POSITION_SYMBOL = "-";
    private static final String WINNER_MESSAGE_FORMAT = "%s가 최종 우승했습니다.";
    private static final String WINNER_DELIMITER = ", ";

    public static void printRacingResult() {
        System.out.println(TRY_RESULT_MESSAGE);
    }

    public static void printRacingStatus(List<Car> cars) {
        for (Car c: cars) {
            System.out.printf(STATUS_MESSAGE_FORMAT, c.getCarName(), getCurrentPosition(c.getCarPosition()));
        }
        System.out.println();
    }

    private static String getCurrentPosition(int position) {
        return POSITION_SYMBOL.repeat(position);
    }

    public static void printRacingWinner(List<String> winners) {
        System.out.printf(WINNER_MESSAGE_FORMAT, getCombinedWinner(winners));
    }

    private static String getCombinedWinner(List<String> winners) {
        return String.join(WINNER_DELIMITER, winners);
    }
}
