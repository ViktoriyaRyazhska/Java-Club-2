package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;
import java.io.IOException;


public class Task7 extends Input {
    public static void main(String[] args) {

        int hour;
        int minute;
        int second;
        int result;

        System.out.println("Basic task7 'Clock ' is starting");
        System.out.println("Please input number three numbers, which correspond to the hour, minute and second: ");

        try {
            System.out.println("put the hour: ");
            hour = Integer.parseInt(br.readLine());
            if(hour < 0 || hour > 23) throw new IOException("Illegal input of the hour data");
            System.out.println("put the minute");
            minute = Integer.parseInt(br.readLine());
            if(minute < 0 || minute > 59) throw new IOException("Illegal input of the hour data");
            System.out.println("put the second");
            second = Integer.parseInt(br.readLine());
            if(second < 0 || second > 59) throw new IOException("Illegal input of the hour data");
            result = exact_time(hour, minute, second);
            System.out.println("The result is: " + result);



        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);
            Task7.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Back to main menu input 1 ");
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
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task7.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }


    }

    public static int exact_time(int h, int m, int s) {
        return 1000 * s + 60000 * m + 60000 * 60 * h;
    }


}
