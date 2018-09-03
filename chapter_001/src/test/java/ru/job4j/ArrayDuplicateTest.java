package ru.job4j;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void duplicateCheck() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expectedArray = new String[]{"Привет", "Мир", "Супер"};
        String [] resultArray = duplicate.remove(input);
        assertThat(resultArray, arrayContainingInAnyOrder(expectedArray));
     }
}
