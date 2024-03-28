package util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static util.ErrorMessage.*;

public class Validation {
    private static final int NUMBER_LOWER_BOUND = 0;
    private static final int NUMBER_UPPER_BOUND = 100;
    private static final int NAME_MAX_SIZE = 5;

    public static void validationNameSize(String name) {
        if (name.isEmpty() || name.length() > NAME_MAX_SIZE) {
            throw new IllegalArgumentException(NAME_SIZE_ERROR.getMessage());
        }
    }

    public static void validationCarNumber(List<String> names) {
        if (checkUpperBound(names.size())) {
            throw new IllegalArgumentException(CAR_NUMBER_ERROR.getMessage());
        }
    }

    public static void validationDuplicatedName(List<String> names) {
        Set<String> deduplicate = new HashSet<>(names);
        if (deduplicate.size() != names.size()) {
            throw new IllegalArgumentException(NAME_DUPLICATE_ERROR.getMessage());
        }
    }

    public static Integer parseInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(TRY_TYPE_ERROR.getMessage());
        }
    }

    public static void validationTryCount(int tryCount) {
        if (checkLowerBound(tryCount)) {
            throw new IllegalArgumentException(TRY_RANGE_ERROR.getMessage());
        }

        if (checkUpperBound(tryCount)) {
            throw new IllegalArgumentException(TRY_LIMIT_ERROR.getMessage());
        }
    }

    private static boolean checkLowerBound(int number) {
        return number <= NUMBER_LOWER_BOUND;
    }

    private static boolean checkUpperBound(int number) {
        return number >= NUMBER_UPPER_BOUND;
    }
}
