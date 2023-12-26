package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second && first >= third) {
            return first;
        }
        if (second >= first && second >= third) {
            return second;
        }
        if (third >= first && third >= second) {
            return third;
        }
        return result;
    }
}