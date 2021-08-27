package com.softserve.academy.classes;



public class Task9 {
    public static String convert(Boolean b) {
        if (b == null) throw new NullPointerException();
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }
}
