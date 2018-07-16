package ru.job4j;

public class Max {
   public int max(int first, int second, int third) {
        int temp;
        temp = this.max(second, third);
        temp = this.max(first, second);
        temp = this.max(first, third);
        return temp;
    }

    public int max(int first, int second) {
       return (first > second) ? first : second;
   }

 }



