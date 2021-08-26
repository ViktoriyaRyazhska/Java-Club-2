package com.softserve.academy.collections;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task70 extends Input {

    public static void main(String[] args) {

        int number;

        System.out.println("Task 70 Unfinished Loop - Bug Fixing");
        System.out.println("I can output numbers with 1 to your number ");

        try {
            System.out.print("Enter number : ");
            number = Integer.parseInt(br.readLine());
            System.out.println("Alternative string: " + createList(number));

        } catch (IOException |NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "please try again" + ConsoleColors.RESET);
            Task70.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task70.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task70.main(args);
            }
        } catch (IOException e){
            e.printStackTrace ();
    }

}


    public static List createList(int number) {
        if(number <1) {throw new ArithmeticException("Number have to be bigger than one");}

        List list = new ArrayList<>();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}