package rocks.kata_log.string_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorImplTest {

    private StringCalculator classUnderTest;

    @BeforeEach
    public void init() {
        classUnderTest = new StringCalculatorImpl();
    }

    @Test
    void givenEmptyString_whenAdd_thenReturn0() {
        String numbers = "0";
        int expected = 0;

        int actual = classUnderTest.Add(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void given1_whenAdd_thenReturn1() {
        String numbers = "1";
        int expected = 1;

        int actual = classUnderTest.Add(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void given1And2_whenAdd_thenReturn3() {
        String numbers = "1,2";
        int expected = 3;

        int actual = classUnderTest.Add(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void given1And2And3_whenAdd_thenReturn3() {
        String numbers = "1,2,3";

        assertThrows(NumberFormatException.class, () -> classUnderTest.Add(numbers));
    }


}