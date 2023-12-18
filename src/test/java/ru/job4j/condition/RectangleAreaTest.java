package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RectangleAreaTest {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result);
    }

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K8Square2dot56() {
        double expected = 2.56;
        int p = 8;
        int k = 4;
        double output = square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP12K3Square6dot75() {
        double expected = 6.75;
        int p = 12;
        int k = 3;
        double output = square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}