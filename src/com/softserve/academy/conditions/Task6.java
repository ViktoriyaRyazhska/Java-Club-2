package com.softserve.academy.conditions;

public class Task6 {
    public static String updateLight(String current) {
        if (current == null) throw new NullPointerException();
        if (!current.equals("green") || !current.equals("yellow") || !current.equals("red")) {
            throw new IllegalArgumentException();
        }
        switch (current) {
            case "green" -> { return "yellow"; }
            case "yellow" -> { return "red"; }
            default -> { return "green"; }
        }
    }
}
