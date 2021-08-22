package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainLoops {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "35":
                    Task35.main(args);
                    break;
                case "36":
                    Task36.main(args);
                case "37":
                    Task37.main(args);
                    break;
                case "45":
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
        System.out.println(ConsoleColors.GREEN + "35" + ConsoleColors.RESET + " return a new array with each value doubled ");
        System.out.println(ConsoleColors.GREEN + "36" + ConsoleColors.RESET + " Counting sheep... ");
        System.out.println(ConsoleColors.GREEN + "37" + ConsoleColors.RESET + " Reversed sequence ");
        System.out.println(ConsoleColors.GREEN + "45" + ConsoleColors.RESET + " Gap in Prime ");

    }
}
