package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"10"})
    void calculateRangeSqrtCeil(int expected) {
        MathService service = new MathService();
        int actual = service.calculateRangeSqrtCeil(99);
        assertEquals(expected, actual);
    }
}