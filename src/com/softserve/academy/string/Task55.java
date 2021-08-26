package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task55 extends Input {
    public static void main(String[] args) {
        String line;

        System.out.println("");
        System.out.println("String 55 ");
        System.out.println("Replace all dots");
        System.out.println("I can  replace all the dots . in the specified String str with dashes -");
        System.out.println("for example: one.two.three  -> one-two-three ");

        try {
            System.out.println("put line");
            line = br.readLine();
            System.out.println(replaceDots(line));
        } catch (IOException | NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task54.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task54.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task54.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }

    public static String replaceDots(final String str) {
        if (str == null) {
            throw new NullPointerException();
        }

        return str.replaceAll("[.]", "-");
    }
}
