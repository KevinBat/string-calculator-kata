package rocks.kata_log.string_calculator;

import java.util.Arrays;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int Add(String numbers) {
        int sum = 0;
        if (!numbers.isEmpty()) {
            String[] split = numbers.split("[\\n,]", -1);

            sum = Arrays.stream(split)
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return sum;
    }

}
