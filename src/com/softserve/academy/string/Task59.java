package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task59 extends Input {
    public static void main(String[] args) {

        Character symbol;

        System.out.println("\nTask 59: get position in alphabet. ");

        try {
            System.out.print("Enter character a-z (lower case only): ");
            symbol = br.readLine().charAt(0);
            if (symbol < 97 || symbol > 122) {
                throw new IOException();
            }
            System.out.println(position(symbol));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have entered wrong character, please try again" + ConsoleColors.RESET);
            Task59.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task59.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task59.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


    public static String position(char alphabet) {
        return "Position of alphabet: " + (alphabet - 96);
    }
}
