package com.softserve.academy.collections;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 extends Input {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Task 39:  remove even numbers from the list and return a list that contains the odd numbers.. ");


        try {
            System.out.println("Enter numbers, after each click enter: ");
            while (true) {
                list.add(Integer.parseInt(br.readLine()));
                System.out.println("Stop? Enter 1");
                if(br.readLine().equals(1)) break;
            }
            System.out.println("Result: " + filterOddNumber(list).toString());



        } catch (IOException | NullPointerException |ArithmeticException | IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task3.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task3.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task3.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        if (listOfNumbers.size() == 0) throw new IllegalArgumentException();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                i--;
            }
        }
        return listOfNumbers;
    }
}
