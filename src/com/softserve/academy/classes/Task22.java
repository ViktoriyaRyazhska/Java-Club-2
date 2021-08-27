package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;
import java.io.IOException;

public class Task22 extends Input {
    public static void main(String args[]){
        int byear;
        int year;

        try{
            System.out.println("Please, write in the year of your birth: ");
            byear = Integer.parseInt(br.readLine());
            System.out.println("Please, write in the other year: ");
            year = Integer.parseInt(br.readLine());

            System.out.println("You " + (years(byear, year) > 0 ? "were born " +
                    years(byear, year) + " years ago!" : (years(byear, year) < 0 ? " will be born in " +
                    Math.abs((years(byear, year)))+ " years!"  : "were born this very year!")));
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
                    Task22.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task22.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }
    public static int years(int birthyear, int year){
        if(birthyear <= 0 || year <= 0) throw new IllegalArgumentException("1");
        return year - birthyear;
    }
}
