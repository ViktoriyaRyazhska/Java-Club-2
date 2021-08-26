package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;


import java.io.IOException;
import java.math.BigDecimal;


public class Task3 extends Input {
    public static void main(String[] args) {
        double length;
        double width;
        double height;
        double result;


        System.out.println("");
        System.out.println("Basic task3 ");
        System.out.println("I can  calculate the volume of a cuboid ");
        System.out.println("Please input length, width, height");

        try {
            System.out.println("put length");
            length = Double.parseDouble(br.readLine());
            System.out.println("put width");
            width = Double.parseDouble(br.readLine());
            System.out.println("put height");
            height = Double.parseDouble(br.readLine());
            result = getVolumeOfCuboid(length, width, height);
            System.out.println("volume of a cuboi is " + result);

        } catch (IOException | NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task3.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task3.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task3.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


    public static double getVolumeOfCuboid(final double length, final double width, final double height) throws ArithmeticException {
        if (length <= 0 || width <= 0 || height <= 0) throw new ArithmeticException("value can't be <= 0 ");
        BigDecimal bd = BigDecimal.valueOf(length).multiply(BigDecimal.valueOf(width)).multiply(BigDecimal.valueOf(height));
        return bd.doubleValue();
    }
}
