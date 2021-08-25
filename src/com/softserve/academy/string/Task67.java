package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task67 extends Input {
    public static void main(String[] args) {
        String line;

        System.out.println("\nTask 67: change case of each char in string to opposite. ");

        try {
            System.out.print("Enter line: ");
            line = br.readLine();
            System.out.println("Alternative string: " + toAlternativeString(line));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have entered wrong line, please try again" + ConsoleColors.RESET);
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
                    Task67.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task67.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static String toAlternativeString(String string) {
        // your code here!
        String answer = "";
        for(char i : string.toCharArray()) {
            if (Character.isUpperCase(i)) {
                answer += Character.toLowerCase(i);
            }
            else {
                answer += Character.toUpperCase(i);
            }
        }
        return answer;
    }
}
