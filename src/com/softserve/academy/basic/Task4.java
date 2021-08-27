package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;


public class Task4 extends Input {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        boolean result;

        System.out.println("");
        System.out.println("Basic task4 'Pixel art planning' is starting");
        System.out.println(" you can fit an exact number of pixels on the wall or cant  ");
        System.out.println("Please input number two numbers");

        try {
            System.out.println("put the size of the wall");
            numberOne =Integer.parseInt(br.readLine());
            System.out.println("put size of a pixel in millimeters");
            numberTwo =Integer.parseInt(br.readLine());
            result = isDivisible(numberOne,numberTwo);
            if(result){
                System.out.println("can exactly fit an integer number ");
            }else {
                System.out.println("can't exactly fit an integer number ");
            }


        } catch (IOException | NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task4.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task4.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task4.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }

    public static boolean isDivisible(int wallLength, int pixelSize) {
        if (wallLength <= 0 || pixelSize <=0 ) { throw new ArithmeticException("Value can't be <= 0 ");}
        return wallLength%pixelSize==0;
    }
}
