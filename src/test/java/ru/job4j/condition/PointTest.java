package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when22to42then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 4;
        int x2 = 2;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenMinus32toMinus62Then9dot43() {
        double expected = 9.43;
        int x1 = -3;
        int y1 = -6;
        int x2 = 2;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when5Minus1to64Then6dot32() {
        double expected = 6.32;
        int x1 = 5;
        int y1 = 6;
        int x2 = -1;
        int y2 = 4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
