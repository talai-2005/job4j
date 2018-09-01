package ru.job4j;

import java.util.*;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; out < unique; in++) {
                if (array[out].equals(array[in])){
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
