package rocks.kata_log.string_calculator;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int Add(String numbers) {
        int sum = 0;
        if (!numbers.isEmpty()) {
            String[] split = numbers.split(",", 2);
            sum += Integer.parseInt(split[0]);
            if (split.length > 1) sum += Integer.parseInt(split[1]);
        }
        return sum;
    }

}
