package ru.job4j;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int n = data.length;
        for (int i = 0; i < n; i++) {
            if (data[0][0] != data[i][i])
                if (data[data.length - 1][0] != data[data.length - (i + 2)][i + 1])
                    result = false;
                    break;
        }
        return result;
    }
}