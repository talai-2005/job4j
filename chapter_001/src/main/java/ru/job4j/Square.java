package ru.job4j;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int a = 1; a <= rst.length; a++) {
            int base = a;
            int power = 2;
            rst [a] = (int)Math. pow(base, power);
        }
        return rst;
    }
}
