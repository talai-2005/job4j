package ru.job4j;

public class Counter {
    int temp = 0;
    public int add(int start, int finish) {
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                temp += index;
            }
        }
        return temp;
    }
}


