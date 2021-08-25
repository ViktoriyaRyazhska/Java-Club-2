package com.softserve.academy.conditions;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;
import com.softserve.academy.basic.Task7;

import java.io.IOException;

import static com.softserve.academy.Input.br;

public class Task27 {

    public static void main(String[] args) {
        int cap;
        int on;
        int wait;

        System.out.println("Basic task7 'Bus Driver' is starting");
        System.out.println("Please input number three numbers: ");


        try {
            System.out.println("Write the capacity of the bus: ");
            cap = Integer.parseInt(br.readLine());
            if (cap < 0) throw new IOException("Illegal input");
            System.out.println("Write the quantity of people on the bus: ");
            on = Integer.parseInt(br.readLine());
            if (on < 0 || on > cap) throw new IOException("Illegal input");
            System.out.println("Write the quantity of the people waiting for the bus: ");
            wait = Integer.parseInt(br.readLine());
            if (wait < 0) throw new IOException("Illegal input");
            if(Enough(cap, on, wait) == 0) System.out.println("There is enough place on bus for everyone. ");
            else System.out.println("There is no place for " + Enough(cap, on, wait) + " people on the bus");



        } catch (IOException | NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);
            Task27.main(args);
        }


        System.out.println(ConsoleColors.GREEN + "Back to main menu input:  1 ");
        System.out.println("Try again  input:  2 " + ConsoleColors.RESET);
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
                    Task27.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }




    }



    public static int Enough(int cap, int on, int wait) {
        return (cap - on - wait >= 0) ? 0 : (cap - on - wait) * -1;
    }
}
