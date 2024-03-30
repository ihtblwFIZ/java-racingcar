package view;

import util.Validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static view.ViewMessage.*;

public class InputView {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static List<String> getCarName() throws IOException {
        System.out.println(INPUT_CAR_NAME_MESSAGE.getMessage());
        return splitNames(bufferedReader.readLine());
    }

    private static List<String> splitNames(String names) {
        return Arrays.stream(names.split(SEPARATOR_VALUE.getMessage()))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public static int getTryCount() throws IOException {
        System.out.println(TRY_COUNT_MESSAGE.getMessage());
        return Validation.parseInteger(bufferedReader.readLine());
    }
}
