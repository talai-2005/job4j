package ru.job4j;

public class Max {
    private int first, second, third;

    public int max(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
        int temp = Math.max(this.first, Math.max(this.second, this.third));
        return temp;
    }
    }
