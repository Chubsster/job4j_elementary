package ru.job4j.calculator.converter;

import org.junit.jupiter.api.Test;
import ru.job4j.calculator.Fit;
import static org.assertj.core.api.Assertions.*;

public class FitTest {
    @Test
    void whenMan180then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }
}
