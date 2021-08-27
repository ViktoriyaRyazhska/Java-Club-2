package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task56 extends Input {

    public static void main(String[] args) {
        double x;
        System.out.println("");
        System.out.println("String 56 ");
        System.out.println("Are You Playing Banjo?");
        System.out.println("If your name starts with the letter 'R' or lower case 'r' you are playing banjo!");

        try {
            System.out.println("put your name");
            System.out.println(areYouPlayingBanjo(br.readLine()));


        } catch (IOException | NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task56.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task56.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task56.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }



    }


    public static String areYouPlayingBanjo(String name) {
        if(name == null){throw new NullPointerException();}

        if (name.charAt(0) == 'r' || name.charAt(0) == 'R') {
            return "Rikke plays banjo";
        }
        return "Martin does not play banjo";
    }
}
