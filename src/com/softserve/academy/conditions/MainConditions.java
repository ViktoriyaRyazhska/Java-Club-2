package com.softserve.academy.conditions;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;

import java.io.IOException;


public class MainConditions extends Input {
    public static void main(String[] args) {
        text();
        try {
            switch (br.readLine()) {
                case "1":
                    Task25.main(args);
                    break;
                case "2":
                    Task26.main(args);
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
        System.out.println(ConsoleColors.GREEN + "1" + ConsoleColors.RESET + "     Timmy love Sarah ");
        System.out.println(ConsoleColors.GREEN + "2" + ConsoleColors.RESET + "     Convert boolean values to strings 'Yes' or 'No ");


    }
}
