package view;

import domain.Car;

import java.util.List;

import static view.ViewMessage.*;

public class OutputView {

    public static void printRacingResult() {
        System.out.println(TRY_RESULT_MESSAGE.getMessage());
    }

    public static void printRacingStatus(List<Car> cars) {
        for (Car c: cars) {
            String position = getCurrentPosition(c.getCarPosition());
            System.out.printf(STATUS_MESSAGE_FORMAT.getMessage(), c.getCarName(), position);
        }
        System.out.println();
    }

    private static String getCurrentPosition(int position) {
        return POSITION_SYMBOL.getMessage().repeat(position);
    }

    public static void printRacingWinner(List<String> winners) {
        System.out.printf(WINNER_MESSAGE_FORMAT.getMessage(), getCombinedWinner(winners));
    }

    private static String getCombinedWinner(List<String> winners) {
        return String.join(DELIMITER_VALUE.getMessage(), winners);
    }
}
