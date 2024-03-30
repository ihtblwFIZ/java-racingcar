package view;

import domain.Car;

import java.util.List;

import static view.ViewMessage.*;

public class OutputView {

    // 실행 결과 메시지 출력
    public static void printRacingResult() {
        System.out.println(TRY_RESULT_MESSAGE.getMessage());
    }

    // 실행 결과 출력
    public static void printRacingStatus(List<Car> cars) {
        for (Car c: cars) {
            String position = getCurrentPosition(c.getCarPosition());
            System.out.printf(STATUS_MESSAGE_FORMAT.getMessage(), c.getCarName(), position);
        }
        System.out.println();
    }

    // 심볼로 표현된 위치 반환
    private static String getCurrentPosition(int position) {
        return POSITION_SYMBOL.getMessage().repeat(position);
    }

    // 우승자 출력
    public static void printRacingWinner(List<String> winners) {
        System.out.printf(WINNER_MESSAGE_FORMAT.getMessage(), getCombinedWinner(winners));
    }

    // 합쳐진 우승자 이름 반환
    private static String getCombinedWinner(List<String> winners) {
        return String.join(DELIMITER_VALUE.getMessage(), winners);
    }
}
