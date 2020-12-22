package ge.edu.btu.calculatorapp;

import ge.edu.btu.interfaces.CalculatorService;
import ge.edu.btu.services.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        System.out.println(calculatorService.sum(2,2.1));
        System.out.println(calculatorService.prod(4.2,1));
    }
}
