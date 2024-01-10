package ru.job4j.loop;

public class CheckPrimeNumber {
        public static boolean check(int number) {
            boolean prime = true;
            int hold = 0;
            for (int index = 1; index <= number; index++) {
                hold = index;
                System.out.println(index);
                if (hold == number) {
                    System.out.println("Success");
                    break;
                } else if (hold > number) {
                    System.out.println("Not possible");
                    break;
                }
            }
            return prime;
        }
    }