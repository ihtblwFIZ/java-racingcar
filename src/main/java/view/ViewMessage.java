package view;

public enum ViewMessage {
    INPUT_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
    TRY_COUNT_MESSAGE("시도할 횟수는 몇회인가요?"),
    SEPARATOR_VALUE(","),
    TRY_RESULT_MESSAGE("실행 결과"),
    STATUS_MESSAGE_FORMAT("%s : %s\n"),
    POSITION_SYMBOL("-"),
    WINNER_MESSAGE_FORMAT("%s가 최종 우승했습니다."),
    DELIMITER_VALUE(", ");

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
