package domain;

import util.Validation;

public class TryCount {
    private static final int PLAYABLE_LOWER_BOUND = 1;
    private int tryCount;

    public TryCount(int tryCount) {
        Validation.validationTryCount(tryCount);
        this.tryCount = tryCount;
    }

    public void decreaseTryCount() {
        tryCount--;
    }

    public boolean isPlayable() {
        return PLAYABLE_LOWER_BOUND <= tryCount;
    }
}
