package ru.job4j;

import java.util.ArrayList;
import java.util.Arrays;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
            }
            break;
        }
        return result;
    }
}

