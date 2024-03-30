package domain;

import java.util.Random;

public class RandomNumber {
    private static final int NUMBER_UPPER_BOUND = 10;
    private static final Random random = new Random();

    // 1~10 난수 반환
    public static int getRandomNumber() {
        return random.nextInt(NUMBER_UPPER_BOUND);
    }
}
