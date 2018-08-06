package ru.job4j;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int a = 0; a < rst.length; a++) {
            rst [a] = (a + 1) * (a + 1);
        }
        return rst;
    }
}
