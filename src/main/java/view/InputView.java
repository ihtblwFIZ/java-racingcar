package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String SEPARATOR_VALUE = ",";

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static List<String> getCarName() throws IOException {
        System.out.println(INPUT_CAR_NAME);
        return Arrays.stream(bufferedReader.readLine().split(SEPARATOR_VALUE))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
