package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;


import java.io.IOException;
import java.util.Arrays;

public class Task37 extends Input {

    public static void main(String[] args) {
        int index;

        System.out.println("");
        System.out.println("Lops 37 ");
        System.out.println("Reversed sequence ");
        System.out.println("Build a function that returns an array of integers from n to 1 where n>0.");

        try {
            System.out.println("put number");
            index = Integer.parseInt(br.readLine());
            if(index>0) {
                System.out.println(Arrays.toString(reverse(index)));
            }else {
                System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
                Task37.main(args);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task37.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task36.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task37.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }

    public static int[] reverse(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = n--;
        }
        return array;
    }
}
