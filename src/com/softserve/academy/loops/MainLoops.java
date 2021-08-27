package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;

import java.io.IOException;


public class MainLoops extends Input {
    public static void main(String[] args) {
        text();
        try {
            switch (br.readLine()) {
<<<<<<< HEAD
                case "33":
                    Task33.main(args);
                    break;
                case "35":
=======
                case "4":
>>>>>>> Team5
                    Task35.main(args);
                    break;
                case "5":
                    Task36.main(args);
                case "6":
                    Task37.main(args);
                    break;
                case "7":
                    Task7.main(args);
                    break;
                case "8":
                    Task8.main(args);
                    break;
                case "9":
                    Task9.main(args);
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
<<<<<<< HEAD
        System.out.println(ConsoleColors.GREEN + "33" + ConsoleColors.RESET + " Pet/Human Years ");
        System.out.println(ConsoleColors.GREEN + "35" + ConsoleColors.RESET + " return a new array with each value doubled ");
        System.out.println(ConsoleColors.GREEN + "36" + ConsoleColors.RESET + " Counting sheep... ");
        System.out.println(ConsoleColors.GREEN + "37" + ConsoleColors.RESET + " Reversed sequence ");
        System.out.println(ConsoleColors.GREEN + "45" + ConsoleColors.RESET + " Gap in Prime ");
=======
        System.out.println(ConsoleColors.GREEN + "4" + ConsoleColors.RESET + " return a new array with each value doubled ");
        System.out.println(ConsoleColors.GREEN + "5" + ConsoleColors.RESET + " Counting sheep... ");
        System.out.println(ConsoleColors.GREEN + "6" + ConsoleColors.RESET + " Reversed sequence ");
        System.out.println(ConsoleColors.GREEN + "7" + ConsoleColors.RESET + " You receive an array with your peers' test scores. Now calculate the average and compare your score! ");
        System.out.println(ConsoleColors.GREEN + "8" + ConsoleColors.RESET + " Given a non-empty array of integers, return the result of multiplying the values together in order. ");
        System.out.println(ConsoleColors.GREEN + "9" + ConsoleColors.RESET + " Get sum of positives in array ");
        System.out.println(ConsoleColors.GREEN + "14" + ConsoleColors.RESET + " Gap in Prime ");
>>>>>>> Team5

    }
}
