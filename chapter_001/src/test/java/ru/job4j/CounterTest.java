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
}


