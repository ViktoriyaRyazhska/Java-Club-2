package com.softserve.academy.conditions;

public class Task5 {
    public static String switchItUp(int number) {
        if ((Integer) number == null) throw new NullPointerException();
        if (number < 0 || number > 9) throw  new IllegalArgumentException();
        switch (number) {
            case 9:
                return "Nine";
            case 8:
                return "Eight";
            case 7:
                return "Seven";
            case 6:
                return "Six";
            case 5:
                return "Five";
            case 4:
                return "Four";
            case 3:
                return "Three";
            case 2:
                return "Two";
            case 1:
                return "One";
            default:
                return "Zero";
        }
    }
}
