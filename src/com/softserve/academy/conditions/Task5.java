package com.softserve.academy.conditions;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;
import com.softserve.academy.string.Task57;

import java.io.IOException;

public class Task5 extends Input {
    public static void main(String[] args) {

        Integer line;

        System.out.println("Task 29:  When provided with a number between 0-9, return it in words. ");

        try {
            System.out.print("Enter number: ");
            line = Integer.parseInt(br.readLine());
            System.out.println("Result: " + switchItUp(line));

        } catch (IOException | NullPointerException | IllegalArgumentException e) {
            System.out.println(ConsoleColors.RED + "You have entered wrong color, please try again" + ConsoleColors.RESET);
            Task5.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task5.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task5.main(args);
            }
        } catch (
                IOException | NullPointerException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static String switchItUp(int number) {
        if ((Integer) number == null) throw new NullPointerException();
        if (number < 0 || number > 9) throw  new IllegalArgumentException();
        switch (number) {
            case 9:
                return "Nine";
            case 8:
                return "Eight";
            case 7:
                return "Seven";
            case 6:
                return "Six";
            case 5:
                return "Five";
            case 4:
                return "Four";
            case 3:
                return "Three";
            case 2:
                return "Two";
            case 1:
                return "One";
            default:
                return "Zero";
        }
    }
}
