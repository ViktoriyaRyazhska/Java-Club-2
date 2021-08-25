package com.softserve.academy.conditions;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;


public class Task26 extends Input {
    public static void main(String[] args) {

        String bool = null;

        System.out.println("");
        System.out.println("Conditions ");
        System.out.println("Convert boolean values to strings 'Yes' or 'No'");
        System.out.println("put number of petals flowers");

        try {
            System.out.println("Make Choose send true or false  ");
            System.out.println("put 't' or 'f' ");
            switch (br.readLine()){
                case "t":
                    bool = boolToWord(true);
                    break;
                case  "f":
                    bool = boolToWord(false);
                    break;
            }
            if(bool != null){
                System.out.println(bool);
            }else{
                System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
                Task26.main(args);
            }
        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task26.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task26.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task26.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }

    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        }
        return "No";
    }
}
