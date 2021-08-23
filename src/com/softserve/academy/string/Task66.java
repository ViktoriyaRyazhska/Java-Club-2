package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;
import java.util.Arrays;

public class Task66 extends Input {
    public static void main (String[] args){

        String[] words;

        System.out.println("");
        System.out.println("String 66 ");
        System.out.println("Sort and Star");
        System.out.println("The returned value must be a string, and have '***' between each of its letters.");


        try {
            System.out.println("How many words do you want to put?");
            words = new String[Integer.parseInt(br.readLine())];
            System.out.println("put words");
            for(int i = 0; i<words.length;i++){
               words[i] = (br.readLine());
            }
            System.out.println("values is :");
            System.out.println(twoSort(words));


        } catch (IOException | NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task66.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);

        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task66.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task66.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }



    }



    public static String twoSort(String[] s) {
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        String first = null;
        char x[] = s[0].toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (first == null) {
                first = Character.toString(x[i]);

            } else
            first = first + "***" + x[i] ;

        }
        return first;
    }
}
