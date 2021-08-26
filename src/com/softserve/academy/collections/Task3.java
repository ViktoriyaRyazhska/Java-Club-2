package com.softserve.academy.collections;

import java.util.List;

public class Task3 {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        if (listOfNumbers.size() == 0) throw new IllegalArgumentException();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                i--;
            }
        }
        return listOfNumbers;
    }
}
