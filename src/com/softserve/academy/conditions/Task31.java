package com.softserve.academy.conditions;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;


import java.io.IOException;

public class Task31 extends Input {
    public static void main(String args[]){
        int days;

        try {
            System.out.println("For how many days do you want to rent a car: ");
            days = Integer.parseInt(br.readLine());
            System.out.println("The price for rent makes " + price(days) + "$");
        }catch(IOException | NumberFormatException e){
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);}
        System.out.println(ConsoleColors.GREEN + "Back to main menu input:  1 ");
        System.out.println("Try again  input:  2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task31.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task31.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }
    public static int price(int days){
        if(days < 0) throw new IllegalArgumentException("1");
        int result = days * 40;
        if(days >= 7) result -= 50;
        else if(days >= 3) result -= 20;
        return result;
    }
}
