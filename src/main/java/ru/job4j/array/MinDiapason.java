package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = 1; index < array.length; index++) {
            if (array[index] >= start && array[index] <= finish) {
                min = array[index];
            }
        }
        return min;
    }
}