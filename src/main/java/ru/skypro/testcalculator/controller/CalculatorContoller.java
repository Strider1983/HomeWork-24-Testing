package ru.skypro.testcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.testcalculator.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorContoller {
    public CalculatorContoller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    private final CalculatorService calculatorService;
    @GetMapping
    public String wellcome() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("plus")
    public String plus(int num1, int num2) {
        return num1 + " + " + num2;
    }
    @GetMapping("minus")
    public String minus(int num1, int num2) {
        return num1 + " - " + num2;
    }
    @GetMapping("multiply")
    public String multiply(int num1, int num2) {
        return num1 + " x " + num2;
    }
    @GetMapping("divide")
    public String divide(int num1, int num2) {
        return num1 + " : " + num2;
    }
}
