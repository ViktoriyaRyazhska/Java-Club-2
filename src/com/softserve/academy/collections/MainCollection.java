package com.softserve.academy.collections;

import com.softserve.academy.ConsoleColors;

import com.softserve.academy.Input;


import java.io.IOException;

public class MainCollection extends Input {

    public static void main(String[] args) {
        text();
        try {
            switch (br.readLine()) {
<<<<<<< HEAD
                case  "4":
                    Task72.main(args);
                    break;

=======
                case "1":
                    Task70.main(args);
                    break;
                case "3":
                    Task3.main(args);
                    break;
>>>>>>> Team5
                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    MainCollection.main(args);

            }
        } catch (IOException e) {
            e.printStackTrace();
            MainCollection.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
<<<<<<< HEAD
        System.out.println(ConsoleColors.GREEN + "25" + ConsoleColors.RESET + " Opposites Attract");
        System.out.println(ConsoleColors.GREEN + "4" + ConsoleColors.RESET + " Interactive Dictionary");

=======
        System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + " Unfinished Loop - Bug Fixing");
        System.out.println(ConsoleColors.GREEN + "3" + ConsoleColors.RESET + " Remove even numbers from the list and return a list that contains the odd numbers.");
>>>>>>> Team5
    }
}
