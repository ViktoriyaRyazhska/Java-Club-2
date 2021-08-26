package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;

import java.io.IOException;


public class MainLoops extends Input {
    public static void main(String[] args) {
        text();
        try {
            switch (br.readLine()) {
                case "4":
                    Task35.main(args);
                    break;
                case "5":
                    Task36.main(args);
                case "6":
                    Task37.main(args);
                    break;
                case "14":
                    Task45.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put number with 1 to * ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    MainLoops.main(args);

            }
        } catch (IOException e) {
            e.printStackTrace();
            MainLoops.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "4" + ConsoleColors.RESET + " return a new array with each value doubled ");
        System.out.println(ConsoleColors.GREEN + "5" + ConsoleColors.RESET + " Counting sheep... ");
        System.out.println(ConsoleColors.GREEN + "6" + ConsoleColors.RESET + " Reversed sequence ");
        System.out.println(ConsoleColors.GREEN + "14" + ConsoleColors.RESET + " Gap in Prime ");

    }
}
