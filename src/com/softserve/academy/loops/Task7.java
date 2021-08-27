package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;
import java.util.Arrays;

public class Task7 extends Input {
    public static void main(String[] args) {


        int index;
        int[] array;
        int score;

        System.out.println("Task 39:  Given a non-empty array of integers, return the result of multiplying the values together in order. ");


        try {
            System.out.print("Enter size of array: ");
            index = Integer.parseInt(br.readLine());
            array = new int[index];
            System.out.println("Now enter numbers, after each click enter: ");
            for(int i =0; i<index; i++){
                array[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Now enter your score: ");
            score = Integer.parseInt(br.readLine());
            System.out.println("You are better: " + betterThanAverage(array, score));



        } catch (IOException | NullPointerException |ArithmeticException | IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task7.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task7.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task7.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        if (yourPoints <= 0) throw new IllegalArgumentException();
        for (Integer i : classPoints) {
            if (i < 0) throw new IllegalArgumentException();
        }
        double avg = (Arrays.stream(classPoints).sum() + yourPoints) / (classPoints.length + 1);
        return (yourPoints > avg);
    }
}
