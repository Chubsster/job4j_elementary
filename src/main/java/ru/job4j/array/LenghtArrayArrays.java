package ru.job4j.array;

public class LenghtArrayArrays {
    public static void main(String[] args) {
        int[][] number = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int index = 0; index < number.length; index++) {
            System.out.println("Размер вложенного массива равен: " + number[index].length);
        }
    }
}
