package patterns.structural.wrappers.decorator.task.impl;

import patterns.structural.wrappers.decorator.task.Calculable;

public class CalculatorWithLogger implements Calculable {
    private Calculable calculable;
    public CalculatorWithLogger(Calculable calculable) {
        this.calculable =calculable;
    }

    @Override
    public void sum(double a, double b) {
        System.out.printf("Sum: %s и %s\n", a, b);
        calculable.sum(a, b);
    }

    @Override
    public void multiply(double a, double b) {
        System.out.printf("Multy: %s и %s\n", a, b);
        System.out.printf("Result = %s\n", (a * b));
    }

    @Override
    public void divide(double a, double b) {
        System.out.printf("Div: %s и %s\n", a, b);
        System.out.printf("Result = %s\n", (a / b));
    }

    @Override
    public void subtraction(double a, double b) {
        System.out.printf("Substr: %s и %s\n", a, b);
        System.out.printf("Result = %s\n", (a - b));
    }

    @Override
    public double result() {
        return calculable.result();
    }

    @Override
    public void clear() {
        System.out.println("Clearing");
        calculable.clear();
    }
}
