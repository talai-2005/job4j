package ru.job4j;

public class Factorial {
    int result = 1;
    int calc(int n) {
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
