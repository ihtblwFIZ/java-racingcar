package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class TryCountTest {
    @DisplayName("TryCount가 양의 정수면 유효")
    @ParameterizedTest
    @CsvSource(value = {"1", "5", "100"})
    void should_DoesNotThrowException_When_PositiveTryCount(int number) {
        assertThatCode(() -> new TryCount(number))
                .doesNotThrowAnyException();
    }

    @DisplayName("TryCount가 0 이하면 예외를 던진다")
    @ParameterizedTest
    @CsvSource(value = {"0", "-1", "-100"})
    void should_ThrowException_When_InvalidTryCount(int number) {
        assertThatThrownBy(()-> new TryCount(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
