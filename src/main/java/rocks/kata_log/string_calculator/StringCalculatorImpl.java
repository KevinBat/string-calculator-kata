package rocks.kata_log.string_calculator;

import java.util.Arrays;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int Add(String numbers) {
        int sum = 0;
        if (!numbers.isEmpty()) {
            if (numbers.startsWith("//")) {
                sum = getSum(numbers.substring(4), numbers.charAt(2));
            } else {
                sum = getSum(numbers, ',');
            }
        }
        return sum;
    }

    private int getSum(String numbers, char delimiter) {
        int sum;
        String[] split = numbers.split("[\\n" + delimiter + "]", -1);

        sum = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .sum();
        return sum;
    }

}
