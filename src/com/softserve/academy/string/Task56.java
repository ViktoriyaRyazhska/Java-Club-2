package com.softserve.academy.string;

import com.softserve.academy.Input;

public class Task56 extends Input {

    public static void main(String[] args) {



    }


    public static String areYouPlayingBanjo(String name) {

        if (name.charAt(0) == 'r' || name.charAt(0) == 'R') {
            return "Rikke plays banjo";
        }
        return "Martin does not play banjo";
    }
}
