package com.softserve.academy.conditions;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task6 extends Input {
    public static void main(String[] args) {

        String line;

        System.out.println("Task 30:  Get the next color of traffic light ");

        try {
            System.out.print("Enter color (greed, red, yellow only): ");
            line = br.readLine();
            System.out.println("Result: " + updateLight(line));

        } catch (IOException | NullPointerException | IllegalArgumentException e) {
            System.out.println(ConsoleColors.RED + "You have entered wrong color, please try again" + ConsoleColors.RESET);
            Task6.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task6.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task6.main(args);
            }
        } catch (
                IOException | NullPointerException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static String updateLight(String current) {
        if (current == null) throw new NullPointerException();
        switch (current) {
            case "green" -> { return "yellow"; }
            case "yellow" -> { return "red"; }
            case "red" -> { return "green"; }
            default -> { throw new IllegalArgumentException(); }
        }
    }
}
