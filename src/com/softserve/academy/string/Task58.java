package com.softserve.academy.string;

public class Task58 {

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";

        for (int i = 0; i < one.length(); i++){
            result += Character.toString(one.charAt(i)) + Character.toString(two.charAt(i)) + Character.toString(three.charAt(i));
        }
        return result;
    }
}