package domain;

public class Position {
    // 자동차 위치
    private static final int INITIAL_POSITION = 0;
    private int position;

    public Position() {
        position = INITIAL_POSITION;
    }

    // 위치 반환
    public int getPosition() {
        return position;
    }

    // 위치 증가(전진)
    public void increasePosition() {
        position++;
    }
}
