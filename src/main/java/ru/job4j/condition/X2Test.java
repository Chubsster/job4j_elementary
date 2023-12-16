package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test

    void whenABCXThen() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        expected = 3;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
        a = 1;
        b = 1;
        c = 0;
        x = 1;
        expected = 2;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
        a = 1;
        b = 1;
        c = 1;
        x = 0;
        expected = 1;
        result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}