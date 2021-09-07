package ru.job4j.calculator;

public class CalculatorFit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println("Man 174 is " + CalculatorFit.manWeight(174));
        System.out.println("Woman 164 is " + CalculatorFit.womanWeight(164));
    }
}
