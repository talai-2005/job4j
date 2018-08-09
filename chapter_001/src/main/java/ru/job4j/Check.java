package ru.job4j;

import java.util.ArrayList;
import java.util.Arrays;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length / 2; i++) {
            if (data[0] != data[i]) {
               return false;
            } else return true;

        } return result;
    }
}