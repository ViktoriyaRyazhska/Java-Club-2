package com.softserve.academy.opp;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 extends Input {
    private static Map<Character, String> dictionary;

    static {
        dictionary = new HashMap<Character, String>();
        dictionary.put('a', "4");
        dictionary.put('e', "3");
        dictionary.put('l', "1");
        dictionary.put('m', "/^^\\");
        dictionary.put('o', "0");
        dictionary.put('u', "(_)");
    }

    public static String encode(String source){
        if (source == null) {
            return "";
        }
        String result = "";
        for(char x : source.toCharArray()) {
            String temp = dictionary.get(Character.toLowerCase(x));
            if (temp != null) {
                result += temp;
                continue;
            }
            result += x;
        }
        return result;
    }

    public static void main(String[] args) {

        String line;

        System.out.println("\nTask 49: translate to L3375p34k ");

        try {
            System.out.print("Enter line: ");
            line = br.readLine();
            System.out.println("Translated: " + encode(line));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have entered wrong line, please try again" + ConsoleColors.RESET);
            Task3.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task3.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task3.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
