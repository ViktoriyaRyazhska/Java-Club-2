package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;

import java.io.IOException;


public class MainClasses extends Input {
    public static void main(String[] args) {
        text();
        try {
            switch (br.readLine()) {
                case "1":
                    Task12.main(args);
                    break;
                case "2":
                    Task13.main(args);
                    break;
                case "7":
                    Task7.main(args);
                    break;
                case "8":
                    Task8.main(args);
                    break;
                case "13":
                    Task24.main(args);
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
        System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + "  Encapsulation");
        System.out.println(ConsoleColors.GREEN + "2" + ConsoleColors.RESET + " FIXME: Static electrickery");
        System.out.println(ConsoleColors.GREEN + "7" + ConsoleColors.RESET + " Get opposite number");
        System.out.println(ConsoleColors.GREEN + "8" + ConsoleColors.RESET + " Check if n is divisible by x and y");
        System.out.println(ConsoleColors.GREEN + "13" + ConsoleColors.RESET + " Basic calculator");



    }

}
