package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.basic.DoubleInteger;
import com.softserve.academy.classes.MainClasses;
import com.softserve.academy.collections.MainCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainString {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "1":
                    break;
                case "9":
                    Task59.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    MainString.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            MainString.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + "  ");
        System.out.println(ConsoleColors.GREEN + "9" + ConsoleColors.RESET + " Get position of a character in alphabet");
    }
}
