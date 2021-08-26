package com.softserve.academy.conditions;

public class Task6 {
    public static String updateLight(String current) {
        if (current == null) throw new NullPointerException();
        switch (current) {
            case "green" -> { return "yellow"; }
            case "yellow" -> { return "red"; }
            case "red" -> { return "green"; }
            default -> { throw new IllegalArgumentException(); }
        }
    }
}
