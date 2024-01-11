package ru.job4j.loop;

public class CheckPrimeNumber {
        public static boolean check(int number) {
            boolean prime = number > 1;
            for (int index = 2; index < number; index++) {
                System.out.println(index);
                if (number % index == 0) {
                    System.out.println("Success");
                    prime = false;
                    break;
                } else if (index > number) {
                    System.out.println("Not possible");
                    break;
                }
            }
            return prime;
        }
    }