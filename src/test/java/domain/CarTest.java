package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

class CarTest {
    @DisplayName("자동차 이름이 1~5글자면 유효")
    @ParameterizedTest
    @CsvSource(value = {"a", "ab", "abc"})
    void should_DoesNotThrowException_When_ValidNameSIze(String name) {
        assertThatCode(() -> new Car(name))
                .doesNotThrowAnyException();
    }

    @DisplayName("자동차 이름이 1~5글자가 아니라면 예외를 던진다")
    @ParameterizedTest
    @CsvSource(value = {"''", "qwertyuio", "abcdef", "null"}, nullValues = "null")
    void should_ThrowException_When_InvalidNameSize(String name) {
        assertThatThrownBy(() -> new Car(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
