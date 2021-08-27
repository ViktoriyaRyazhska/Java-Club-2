package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;
import com.softserve.academy.classes.Task23;

import java.io.IOException;
import java.math.BigDecimal;

public class Task33 extends Input {

    public static void main(String args[]){
        String years;
        try{
            System.out.println("Write in the human years: ");
            years = br.readLine();
            System.out.println("This is the result:");
            int[] arr;
            arr = pet_human_years(Integer.parseInt(years));
            System.out.println("Human years: " + arr[0]);
            System.out.println("Cat years: " + arr[1]);
            System.out.println("Pet years: " + arr[2]);


        }
        catch(IOException | NumberFormatException e){
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);
            Task23.main(args);

        }

        System.out.println(ConsoleColors.GREEN + "Back to main menu input:  1 ");
        System.out.println("Try again  input:  2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task33.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task33.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }

    }

    public static int[] pet_human_years(Integer humanY){
        try{
        if(humanY < 1 || !(humanY instanceof Integer)) throw new IOException("Illegal");}
        catch(IOException | NumberFormatException e){
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);
            //Task23.main(args[]);

        }
        int[] result= new int[3];
        switch (humanY){
            case 1:
                result[0] = 1;
                result[1] = 15;
                result[2] = 15;
                break;
            case 2:
                result[0] = 2;
                result[1] = 24;
                result[2] = 24;
                break;
            default:
                result[0] = humanY;
                result[1] = 24 + (humanY - 2) * 4;
                result[2] = 24 + (humanY - 2) * 5;
        }
        return result;
    }
}
