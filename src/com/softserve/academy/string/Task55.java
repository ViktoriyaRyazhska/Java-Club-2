package com.softserve.academy.string;

import com.softserve.academy.Input;

public class Task55 extends Input {
    public static void main(String[] args) {
        System.out.println(replaceDots("one.two.three"));
    }

    public static String replaceDots(final String str) {
        String x = str;
        char dod [] = str.toCharArray();
        for (int i = 0 ; i<dod.length;i++){
            if(dod[i] == '.'){
                dod[i] = '-';
            }
        }
        return String.valueOf(dod);
    }
}
