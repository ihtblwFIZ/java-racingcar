package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CarsTest {
    @DisplayName("자동차가 1대 이상이고 이름 중복이 없으면 유효")
    @ParameterizedTest
    @CsvSource(value = {"1, 50, 100"})
    void should_DoesNotThrowException_When_ValidCar(int size) {
        List<String> carNames = new ArrayList<>();
        for (int i=0; i<size; i++) {
            carNames.add("a"+i);
        }

        assertThatCode(() -> new Cars(carNames))
                .doesNotThrowAnyException();
    }

    @DisplayName("자동차가 0대면 예외를 던진다")
    @Test
    void should_ThrowException_When_InvalidCarNumber() {
        List<String> carNames = Collections.emptyList();

        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @DisplayName("자동차 이름이 중복되면 예외를 던진다")
    @ParameterizedTest
    @CsvSource(value = {"2", "5", "10"})
    void should_ThrowException_When_DuplicatedName(int size) {
        List<String> carNames = new ArrayList<>();
        for(int i=0; i<size; i++) {
            carNames.add("a");
        }

        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
