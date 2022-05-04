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

    //STEP 1

    @Test
    void givenEmptyString_whenAdd_thenReturn0() {
        String numbers = "";
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

    //STEP 2

    @Test
    void given1And2And3_whenAdd_thenReturn6() {
        String numbers = "1,2,3";
        int expected = 6;

        int actual = classUnderTest.Add(numbers);

        assertEquals(expected, actual);
    }

    //STEP 3

    @Test
    void given1And2And3WithNewLine_whenAdd_thenReturn6() {
        String numbers = "1\n2,3";
        int expected = 6;

        int actual = classUnderTest.Add(numbers);

        assertEquals(expected, actual);
    }

    // STEP 4

    @Test
    void givenNewDelimiterAnd1And2_whenAdd_thenReturn3() {
        String numbers = "//;\n1;2";
        int expected = 3;

        int actual = classUnderTest.Add(numbers);

        assertEquals(expected, actual);
    }


    //ERROR CASE

    // STEP 1

    @Test
    void givenToto_whenAdd_thenThrowsNumberFormatException() {
        String numbers = "toto";

        assertThrows(NumberFormatException.class, () -> classUnderTest.Add(numbers));
    }

    // STEP 3

    @Test
    void given1CommaAndNewLine_whenAdd_thenThrowsNumberFormatException() {
        String numbers = "1,\n";

        assertThrows(NumberFormatException.class, () -> classUnderTest.Add(numbers));
    }


}