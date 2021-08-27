package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;


import java.io.IOException;


public class Task8 extends Input {
    public static void main(String[] args) {

        int n;
        int x;
        int y;

        System.out.println("\nTask 19: check if n is divisible by x and y. ");
        try {
            System.out.print("Enter n: ");
            n = Integer.parseInt(br.readLine());
            System.out.print("\nEnter x: ");
            x = Integer.parseInt(br.readLine());
            System.out.println("\nEnter x: ");
            y = Integer.parseInt(br.readLine());
            System.out.println("Result: " +  Boolean.toString(isDivisible(n, x, y)));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You don't put wrong number try again" + ConsoleColors.RESET);
            Task8.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
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
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task8.main(args);
            }
        } catch (
                IOException | ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static boolean isDivisible(long n, long x, long y) {
        if ((Long) n == null || (Long) x == null || (Long) y == null) throw new NullPointerException();
        if (x == 0 || y == 0) throw new ArithmeticException();
        return (n%x==0 && n%y==0);
    }
}
