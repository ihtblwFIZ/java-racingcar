package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {
    @DisplayName("increasePosition은 position을 1 증가시킨다")
    @ParameterizedTest
    @CsvSource(value = {"1"})
    void should_IncreasePosition_When_UsingIncreasePosition(int movedPosition) {
        Position position = new Position();
        position.increasePosition();

        assertEquals(position.getPosition(), movedPosition);
    }
}
