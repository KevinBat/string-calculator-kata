package rocks.kata_log.string_calculator;

import java.util.StringJoiner;

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
        int sum = 0;
        String[] split = numbers.split("[\\n" + delimiter + "]", -1);

        StringJoiner negativeValues = new StringJoiner(", ");
        for (String s : split) {
            int n = Integer.parseInt(s);
            sum += n;
            if (n < 0) negativeValues.add(s);
        }

        if (negativeValues.length() > 0) {
            throw new IllegalArgumentException("negatives not allowed : " + negativeValues.toString());
        }

        return sum;
    }


}
