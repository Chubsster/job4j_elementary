package ru.job4j.calculator.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 evro. Test result :" + passed);
        float input1 = 120;
        float expected1 = 2;
        float output1 = rubleToDollar(input1);
        boolean passed1 = expected1 == output1;
        System.out.println("120 rubles are 2 dollar. Test result :" + passed1);
    }
}

