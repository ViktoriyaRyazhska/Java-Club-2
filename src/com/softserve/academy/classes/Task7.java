package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;

        System.out.println("\nTask 18: get opposite number. ");

        try {
            System.out.print("Enter number: ");
            number = Integer.parseInt(br.readLine());
            System.out.println("Opposite number: " +  opposite(number));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have not entered number in correct way, please try again" + ConsoleColors.RESET);
            Task7.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task7.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task7.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static int opposite(int number) {
        return -number;
    }
}
