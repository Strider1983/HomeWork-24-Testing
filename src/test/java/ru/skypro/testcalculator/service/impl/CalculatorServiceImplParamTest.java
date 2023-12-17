package ru.skypro.testcalculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    private static Stream<Arguments> provideNumbersForCalculator() {
        return Stream.of(
                Arguments.of(10, 20),
                Arguments.of(18, 13),
                Arguments.of(75, 64)
        );
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculateSumCorrectly(int num1, int num2) {
        int expectedResult = num1 + num2;

        int actualResult = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculateDifferenceCorrectly(int num1, int num2) {
        int expectedResult = num1 - num2;

        int actualResult = calculatorService.minus(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculateMultiplectionCorrectly(int num1, int num2) {
        int expectedResult = num1 * num2;

        int actualResult = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculateDivisionCorrectly(int num1, int num2) {
        double expectedResult = (double) num1 / num2;

        double actualResult = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
