package util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ValidationTest {
    @DisplayName("정수가 들어오면 유효")
    @ParameterizedTest
    @CsvSource(value = {"1", "5", "100"})
    void should_DoesNotThrowException_When_InputIsInteger(String input) {
        assertThatCode(() -> Validation.parseInteger(input))
                .doesNotThrowAnyException();
    }

    @DisplayName("정수가 아닌 값이 들어오면 예외를 던진다")
    @ParameterizedTest
    @CsvSource(value = {"a", "5.5", "''", "***"})
    void should_ThrowException_When_InputIsNotInteger(String input) {
        assertThatThrownBy(() -> Validation.parseInteger(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
