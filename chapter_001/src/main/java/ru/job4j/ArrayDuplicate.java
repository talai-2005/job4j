package ru.job4j;

import java.util.*;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        Set<String> myArray  = new HashSet<String>();
        Collections.addAll(myArray, array);
        String[] newArray = myArray.toArray(new String[myArray.size()]);
        return newArray;
    }
}
