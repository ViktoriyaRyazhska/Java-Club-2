package com.softserve.academy.collections;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.conditions.Task25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCollection extends Input {
    public static void main(String[] args) {
        text();
        try {
            switch (br.readLine()) {

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
        System.out.println(ConsoleColors.GREEN + "25" + ConsoleColors.RESET + " Opposites Attract");

    }
}
