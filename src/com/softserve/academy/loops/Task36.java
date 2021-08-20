package com.softserve.academy.loops;
import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task36 {

        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Boolean[] boll = {true, true, true, false,
                    true, true, true, true,
                    true, false, true, false,
                    true, false, false, true,
                    true, true, true, true,
                    false, false, true, true};

            System.out.println("");
            System.out.println("Lops 36");
            System.out.println("Counting sheep...");
            System.out.println("We need a function that counts the number of sheep present in the array (true means present).");
            System.out.println("We have array " + Arrays.toString(boll));
            System.out.println("method count sheep ");
            System.out.println("we have " +   countSheeps(boll) + "sheep" );
            System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
            System.out.println("Try again  input 2 " + ConsoleColors.RESET);
            try {
                switch (br.readLine()) {
                    case "1":
                        Main.main(args);
                        break;
                    case "2":
                        Task35.main(args);
                        break;
                    default:
                        System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                        System.err.println("You transfer to menu " + ConsoleColors.RESET);
                        Task36.main(args);
                }
            } catch (IOException e) {
                e.printStackTrace();
                Main.main(args);
            }
        }


        public static int countSheeps(Boolean[] arrayOfSheeps) {
            int counter = 0;
            for (Boolean b : arrayOfSheeps) {
                if (b != null && b) {
                    counter++;
                }
            }
            return counter;
        }
    }
