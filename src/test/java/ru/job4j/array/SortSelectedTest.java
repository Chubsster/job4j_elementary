package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[]{14, 12, 13};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{12, 13, 14};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{8, 4, 2, 6, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 2, 4, 6, 8};
        assertThat(result).containsExactly(expected);
    }
}