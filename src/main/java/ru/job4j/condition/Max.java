package ru.job4j.condition;

import static java.lang.Math.max;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        return left > right ? left : right;
    }
}
