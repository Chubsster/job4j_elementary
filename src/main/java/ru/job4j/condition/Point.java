package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result1 = x2 - x1;
        double result2 = y2 - y1;
        double result3 = Math.pow(2, result1);
        double result4 = Math.pow(2, result2);
        double result5 = result3 + result4;
        double result6 = Math.sqrt(result5);
        return result6;
    }

    public static void main(String[] args) {
        double result6 = distance(3, 4, 2, 1);
        System.out.println("result (3, 2) to (4, 1) " + result6);
    }
}
