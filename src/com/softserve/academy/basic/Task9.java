package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 extends Input {
    public static void main(String[] args) {
        int number;

        System.out.println("\nTask 9: get negative number. ");

        try {
            System.out.print("Enter number: ");
            number = Integer.parseInt(br.readLine());
            System.out.println("Negative: " +  makeNegative(number));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have not entered number in correct way, please try again" + ConsoleColors.RESET);
            Task9.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task8.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task9.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static int makeNegative(final int x) {
        if(x<=0) return x;
        return -x; // Your code here.
    }
}
