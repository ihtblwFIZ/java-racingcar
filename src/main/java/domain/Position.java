package domain;

public class Position {
    // 자동차 위치
    private int position;

    public Position() {
        position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void increasePosition() {
        position++;
    }
}
