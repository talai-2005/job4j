package ru.job4j;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter a = new Counter();
        int result = a.add(1, 10);
        assertThat(result, is(30));
    }
    @Test
    public void whenSumEvenNumbersFromThreeToEightThenThirty() {
        Counter a = new Counter();
        int result = a.add(3, 8);
        assertThat(result, is(18));
    }
    @Test
    public void whenSumEvenNumbersFromTenToTwentyThenNinety() {
        Counter a = new Counter();
        int result = a.add(10, 20);
        assertThat(result, is(90));
    }

}



