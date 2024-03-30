package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min < array[0]) {
                min = array[0];
            }
            if (min < array[1]) {
                min = array[0];
            }
            if (min < array[2]) {
                min = array[0];
            }
        }
        return min;
    }
}

