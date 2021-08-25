package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;


public class Task1  {
    public static void main(String[] args) {

        int numbDouble;

        System.out.println("");
        System.out.println("Basic task 'Double Integer' is starting");
        System.out.println("I can Double the integer and return it! ");
        System.out.println("Please input number");

        try {
            numbDouble = (doubleInteger(Integer.parseInt(br.readLine())));
            System.out.println("Double Integer is " + numbDouble);

        } catch (IOException | NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You don't put wrong number try again" + ConsoleColors.RESET);
            Task1.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task1.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task1.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int doubleInteger(int i) {
        return i * 2;
    }

}
