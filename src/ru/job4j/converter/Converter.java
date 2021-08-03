package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are " + Converter.rubleToEuro(140) + " euro.");
        System.out.println("140 rubles are " + Converter.rubleToDollar(140) + " dollars.");

        float in1 = 140f;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result: " + passed1);

        float in2 = 140f;
        float expected2 = 2;
        float out2 = Converter.rubleToEuro(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 dollars. Test result: " + passed2);
    }
}
