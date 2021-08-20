package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year;

        System.out.println("\nTask 8: get century from year. ");

        try {
            System.out.print("Enter year: ");
            year = Integer.parseInt(br.readLine());
            if (year <= 0) {
                throw new IOException();
            }
            System.out.println("Century: " +  century(year));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have entered wrong year, please try again" + ConsoleColors.RESET);
            Task8.main(args);
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
                    Task8.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static int century(int number) {
        return number % 100 == 0? number / 100 : (number / 100) + 1;
    }
}
