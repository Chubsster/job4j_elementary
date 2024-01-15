package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            if ((word.length >= prefix.length) || (word[index] != prefix[index])) {
                break;
            }
        }
        return result;
    }
    }