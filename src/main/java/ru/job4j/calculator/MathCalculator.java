package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double raznAndDelete(double first, double second) {
        return razn(first, second)
                + delete(first, second);
    }

    public static double totalSum(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + razn(first, second)
                + delete(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен:" + raznAndDelete(10, 5));
        System.out.println("Резултат расчета равен:" + totalSum(10, 5));
    }
}

