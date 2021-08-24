package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task13 extends Input {
    private static int ONE_HUNDRED = 100;

    public static final Task13 INST = new Task13();

    private final int value;

    private Task13() {
        value = ONE_HUNDRED;
    }


    public static void main(String[] args) {

        int number;
        System.out.println("Task 13: return your number + 100 ");

        try {
            System.out.print("Enter number: ");
            number = Integer.parseInt(br.readLine());
            System.out.println("Number : " + Task13.INST.plus100(number));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have not entered number in correct way, please try again" + ConsoleColors.RESET);
            Task13.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task13.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task13.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }


    }


    public int plus100(int n) {
        return value + n;
    }


}
