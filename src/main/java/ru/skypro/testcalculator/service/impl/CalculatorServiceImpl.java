package ru.skypro.testcalculator.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.testcalculator.exeption.DivisionByZeroExeption;
import ru.skypro.testcalculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroExeption("На ноль делить нельзя");
        }
        return (double) num1 / num2;

    }
}
