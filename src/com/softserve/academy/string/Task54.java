package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;


public class Task54 extends Input {
    public static void main(String[] args) {
        int a;

        System.out.println("");
        System.out.println("String 55 ");
        System.out.println("Replace all dots");
        System.out.println("I can given you a opposite number");
        System.out.println("for example: 1 ---> -1  ");

        try {
            System.out.println("put number");
            a = Integer.parseInt(br.readLine());
            System.out.println(opposite(a));

        } catch (IOException | NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task54.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task54.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task54.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }
            public static int opposite ( int number) throws NullPointerException {
                if ((Integer) number == null) {
                    throw new NullPointerException();
                }
                return -number;
            }

        }
