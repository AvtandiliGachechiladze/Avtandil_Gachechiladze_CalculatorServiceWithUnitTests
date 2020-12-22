package ge.edu.btu.services;

import ge.edu.btu.interfaces.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double prod(double number1, double number2) {
        return number1 * number2;
    }
}
