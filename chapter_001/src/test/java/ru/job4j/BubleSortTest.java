package ru.job4j;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BubleSortTest {
    @Test
    public void testImplementation()   {
        BubbleSort bubble = new BubbleSort();
        int[] array = new int[]{1, 5, 4, 2, 3, 7, 8, 0, 9, 6};
        int[] result = bubble.sort(array);
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expected));
    }
}