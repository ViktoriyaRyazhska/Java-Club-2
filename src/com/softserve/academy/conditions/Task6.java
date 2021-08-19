package com.softserve.academy.conditions;

public class Task6 {
    public static String updateLight(String current) {
        if(current.equals("green")) return "yellow";
        if(current.equals("yellow")) return "red";
        return "green";
    }
}
