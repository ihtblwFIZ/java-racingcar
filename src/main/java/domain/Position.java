package domain;

public class Position {
    // 자동차 위치
    private static final int INITIAL_POSITION = 0;
    private int position;

    public Position() {
        position = INITIAL_POSITION;
    }

    public int getPosition() {
        return position;
    }

    public void increasePosition() {
        position++;
    }
}
