package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainString extends Input {
    public static void main(String[] args) {

        text();
        try {
            switch (br.readLine()) {
                case "1":
                    break;
                case "4":
                    Task54.main(args);
                    break;
                case "6":
                    Task56.main(args);
                    break;
                case "7":
                    Task57.main(args);
                    break;
                case "9":
                    Task59.main(args);
                    break;
                case "15":
                    Task65.main(args);
                    break;
                case "16":
                    Task66.main(args);
                    break;
                case "17":
                    Task67.main(args);
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
        System.out.println(ConsoleColors.GREEN + "4" + ConsoleColors.RESET + " Opposite number");
        System.out.println(ConsoleColors.GREEN + "6" + ConsoleColors.RESET + " Are You Playing Banjo?");
        System.out.println(ConsoleColors.GREEN + "7" + ConsoleColors.RESET + " Remove spaces from string");
        System.out.println(ConsoleColors.GREEN + "9" + ConsoleColors.RESET + " Get position of a character in alphabet");
        System.out.println(ConsoleColors.GREEN + "15" + ConsoleColors.RESET + " The returned value must be a string, and have '***' between each of its letters.");
        System.out.println(ConsoleColors.GREEN + "16" + ConsoleColors.RESET + " Sort and Stare");
        System.out.println(ConsoleColors.GREEN + "17" + ConsoleColors.RESET + " Change case of each char in string to opposite");
    }
}
