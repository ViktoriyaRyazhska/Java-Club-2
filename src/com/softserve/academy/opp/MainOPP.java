package com.softserve.academy.opp;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainOPP extends Input {
    public static void main(String[] args) {
        text();
        try {
            switch (br.readLine()) {
                case "3":
                    Task3.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    MainOPP.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            MainOPP.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "3" + ConsoleColors.RESET + " Translate to L3375p34k");

    }
}
