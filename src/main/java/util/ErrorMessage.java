package util;

public enum ErrorMessage {
    NAME_SIZE_ERROR("이름은 1글자 이상 5글자 이하로 작성해주세요."),
    NAME_DUPLICATE_ERROR("이름은 중복될 수 없습니다."),
    CAR_NUMBER_ERROR("자동차는 1대 이상이어야 합니다."),
    TRY_TYPE_ERROR("입력값은 정수여야 합니다."),
    TRY_RANGE_ERROR("시도 횟수는 양의 정수여야 합니다.");

    private final String message;
    private static final String START_ERROR = "[ERROR] ";

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return START_ERROR + message;
    }
}
