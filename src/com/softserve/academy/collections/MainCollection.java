package com.softserve.academy.collections;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.conditions.Task25;
import com.softserve.academy.loops.Task35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCollection  {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "1":
                    Task70.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    MainCollection.main(args);

            }
        } catch (IOException e) {
            e.printStackTrace();
            MainCollection.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + " Unfinished Loop - Bug Fixing");

    }
}
