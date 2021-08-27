package com.softserve.academy.conditions;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.basic.DoubleInteger;
import com.softserve.academy.classes.MainClasses;
import com.softserve.academy.collections.MainCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainConditions {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        text();
        try {
            switch (br.readLine()) {
                case "25":
                    Task25.main(args);
                    break;
                case "26":
                    Task26.main(args);
                    break;
                case "27":
                    Task27.main(args);
                    break;
                case "31":
                    Task31.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED +"You need to put number with 1 to * ");
                    System.err.println("You transfer to menu "+ ConsoleColors.RESET);
                    MainConditions.main(args);

            }
        } catch (IOException e) {
            e.printStackTrace();
            MainConditions.main(args);
        }


    }

    private static void text() {

        System.out.println(ConsoleColors.GREEN + "Please enter TASK number" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "25" + ConsoleColors.RESET + "     Timmy love Sarah ");
        System.out.println(ConsoleColors.GREEN + "26" + ConsoleColors.RESET + "     Convert boolean values to strings 'Yes' or 'No ");
        System.out.println(ConsoleColors.GREEN + "27" + ConsoleColors.RESET + "     Bus Driver ");
        System.out.println(ConsoleColors.GREEN + "31" + ConsoleColors.RESET + "     Car Rental ");

    }
}
