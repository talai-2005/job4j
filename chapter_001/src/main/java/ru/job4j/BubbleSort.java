package ru.job4j;

import java.util.Arrays;

public class BubbleSort {
    private int[] mas;

    public int[] sort(int[] array) {
        mas = array;
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;

                }
            }
        }

        return mas;
    }
}
