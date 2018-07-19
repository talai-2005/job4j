package ru.job4j;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorial a = new Factorial();
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = a.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = a.calc(0);
        assertThat(result, is(1));
    }
}

