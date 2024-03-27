package domain;

import java.util.Random;

public class RandomNumber {
    private static final int NUMBER_UPPER_BOUND = 10;
    private static final Random random = new Random();

    public static int getRandomNumber() {
        return random.nextInt(NUMBER_UPPER_BOUND);
    }
}
