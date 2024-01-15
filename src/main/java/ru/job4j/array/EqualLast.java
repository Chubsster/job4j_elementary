package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i]) {
                break;
            }
        }
        return result;
    }
}