package com.softserve.academy.collections;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;
import com.softserve.academy.basic.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task25 {



    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first;
        int second;
        boolean love ;

        System.out.println("");
        System.out.println("collections task25 ");
        System.out.println("Douse Timmy love Sarah ? ");
        System.out.println("put number of petals flowers");

        try {
            System.out.println("Timm");
            first = Integer.parseInt(br.readLine());
            System.out.println("Sarah");
            second =Integer.parseInt(br.readLine());
            love = isLove(first,second);
            System.out.println(" Douse Timmy love Sarah ? " +  love);

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task25.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    com.softserve.academy.basic.Task3.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task25.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }


    public static boolean isLove(final int flower1, final int flower2) {
     return flower1%2 == 0 && flower2%2 != 0 || flower1%2 != 0 && flower2%2 == 0;
    }

}
