package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.array.MatrixChek.monoHorizontal;
import static ru.job4j.array.MatrixChek.monoVertical;

class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoHorizontal1() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int row = 2;
        boolean result = monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoVertical1() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = monoVertical(input, column);
        assertThat(result).isFalse();
    }
}
