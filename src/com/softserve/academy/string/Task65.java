package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task65 extends Input {


    public static void main(String[] args) {

        String text;

        System.out.println("");
        System.out.println("String 65 ");
        System.out.println("Correct the mistakes of the character recognition software");
        System.out.println("task is correct the errors in the digitised text. You only have to handle the following mistakes:\n" +
                "\n" +
                "    S is misinterpreted as 5\n" +
                "    O is misinterpreted as 0\n" +
                "    I is misinterpreted as 1\n" +
                "\n" +
                "The test cases contain numbers only by mistake.");


        try {
            System.out.println("put text?");
            text = br.readLine();
            System.out.println(correct(text));


        } catch (IOException | NumberFormatException |NullPointerException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task65.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task65.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task65.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }


    }


    public static String correct(String string) {
        if (string == null){throw new NullPointerException();}
        return string
                .replace("5", "S")
                .replace("0", "O")
                .replace("1", "I");
    }
}
