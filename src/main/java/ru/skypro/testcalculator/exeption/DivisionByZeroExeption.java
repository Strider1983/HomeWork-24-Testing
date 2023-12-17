package ru.skypro.testcalculator.exeption;

public class DivisionByZeroExeption extends IllegalArgumentException {
    public DivisionByZeroExeption(String s) {
        super(s);
    }
}
