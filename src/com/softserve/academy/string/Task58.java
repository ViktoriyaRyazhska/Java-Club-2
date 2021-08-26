package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task58 extends Input {
    public static void main(String[] args) {

        String line;

        System.out.println("Task 57:  Combine all of the letters of the three inputed strings in groups ");

        try {
            System.out.print("Enter 3 words of the same length separated by space: ");
            line = br.readLine();
            String[] words = line.split(" ");
            System.out.println("Result: " + tripleTrouble(words[0], words[1], words[2]));

        } catch (IOException | NullPointerException | IllegalArgumentException e) {
            System.out.println(ConsoleColors.RED + "You have done smth wrong, please try again" + ConsoleColors.RESET);
            Task58.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task58.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task58.main(args);
            }
        } catch (
                IOException | NullPointerException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static String tripleTrouble(String one, String two, String three) {
        if (one == null || two == null || three == null) throw new NullPointerException();
        int len = one.length();
        if (two.length() != len || three.length() != len) {
            throw new IllegalArgumentException();
        }
        String result = "";
        for (int i = 0; i < one.length(); i++){
            result += Character.toString(one.charAt(i)) + Character.toString(two.charAt(i)) + Character.toString(three.charAt(i));
        }
        return result;
    }
}