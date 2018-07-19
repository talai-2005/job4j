package ru.job4j;

public class Counter {
    public int add(int start, int finish) {
        int temp = 0;
        for (int index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                temp += index;
            }
            index++;
        }
        return temp;
    }
}
