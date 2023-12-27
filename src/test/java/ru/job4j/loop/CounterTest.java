package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    void when0To10then55() {
        int expected = 55;
        int start = 0;
        int finish = 10;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when5To2then0() {
        int expected = 0;
        int start = 5;
        int finish = 2;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when7To77then2982() {
        int expected = 2982;
        int start = 7;
        int finish = 77;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}
