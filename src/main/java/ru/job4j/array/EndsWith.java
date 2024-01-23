package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        int index = word.length - 1;
        for (int i = postfix.length - 1; i > 0; i++) {
            if (word[index] != postfix[i]) {
                result = false;
            }
            break;
        }
        return result;
    }
}