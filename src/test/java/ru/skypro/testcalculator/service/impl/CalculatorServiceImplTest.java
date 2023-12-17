package ru.skypro.testcalculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    public void calculateSumCorrectly() {
        int num1 = 10, num2 = 20;
        int expectedResult = num1 + num2;

        int actualResult = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateDifferenceCorrectly() {
        int num1 = 10, num2 = 20;
        int expectedResult = num1 - num2;

        int actualResult = calculatorService.minus(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateMultiplectionCorrectly() {
        int num1 = 10, num2 = 20;
        int expectedResult = num1 * num2;

        int actualResult = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateDivisionCorrectly() {
        int num1 = 10, num2 = 20;
        double expectedResult = (double) num1 / num2;

        double actualResult = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
