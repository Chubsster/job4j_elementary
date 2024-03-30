package ru.job4j.ru.job4j.converter;

public class Converter {

    public static float rubleToEvro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollars(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float evro = rubleToEvro(140);
        System.out.println("140 rubles are " + evro + " evro");
        float dollars = rubleToDollars(120);
        System.out.println("120 rubles are " + dollars + " dollars");
    }
}
