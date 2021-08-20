package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClasses {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "7":
                    Task7.main(args);
                    break;
                case "8":
                    Task8.main(args);
                    break;
                case "12":
                    Task12.main(args);
                    break;
                case "13":
                    Task13.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put number with 1 to * ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    MainClasses.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            MainClasses.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "7" + ConsoleColors.RESET + " Get opposite number");
        System.out.println(ConsoleColors.GREEN + "8" + ConsoleColors.RESET + " Check if n is divisible by x and y");
        System.out.println(ConsoleColors.RESET );
        System.out.println(ConsoleColors.GREEN + "13" + ConsoleColors.RESET + " Basic calculator");

    }

}
