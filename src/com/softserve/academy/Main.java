package com.softserve.academy;


import com.softserve.academy.basic.MainBasic;
import com.softserve.academy.classes.MainClasses;
import com.softserve.academy.collections.MainCollection;
import com.softserve.academy.conditions.MainConditions;
import com.softserve.academy.loops.MainLoops;
import com.softserve.academy.opp.MainOPP;
import com.softserve.academy.string.MainString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "1":
                    MainBasic.main(args);
                    break;
                case "2":
                    MainClasses.main(args);
                    break;
                case "3":
                    MainCollection.main(args);
                    break;
                case "4":
                    MainConditions.main(args);
                    break;
                case "5":
                    MainLoops.main(args);
                    break;
                case "6":
                    MainOPP.main(args);
                    break;
                case "7":
                    MainString.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to 7 ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    Main.main(args);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void text() {
        System.out.println(ConsoleColors.GREEN + "Please enter group number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + "  Basic");
        System.out.println(ConsoleColors.GREEN + "2" + ConsoleColors.RESET + "  Classes");
        System.out.println(ConsoleColors.GREEN + "3" + ConsoleColors.RESET + "  Collections");
        System.out.println(ConsoleColors.GREEN + "4" + ConsoleColors.RESET + "  Conditions");
        System.out.println(ConsoleColors.GREEN + "5" + ConsoleColors.RESET + "  Loops");
        System.out.println(ConsoleColors.GREEN + "6" + ConsoleColors.RESET + "  OPP");
        System.out.println(ConsoleColors.GREEN + "7" + ConsoleColors.RESET + "  String");
    }

}