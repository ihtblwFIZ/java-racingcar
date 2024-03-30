package domain;

import util.Validation;

public class TryCount {
    private static final int PLAYABLE_LOWER_BOUND = 1;
    private int tryCount;

    public TryCount(int tryCount) {
        Validation.validationTryCount(tryCount);
        this.tryCount = tryCount;
    }

    // 시도 횟수 감소
    public void decreaseTryCount() {
        tryCount--;
    }

    // 시도 가능 여부 반환
    public boolean isPlayable() {
        return PLAYABLE_LOWER_BOUND <= tryCount;
    }
}
