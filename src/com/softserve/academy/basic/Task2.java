package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;
import java.io.IOException;
import java.math.BigInteger;


public class Task2 extends Input {
    public static void main(String[] args) {


        int numberOne;
        int numberTwo;
        int result;

        System.out.println("");
        System.out.println("Basic task2 'multiplying two numbers' is starting");
        System.out.println("I can multiplying two numbers! ");
        System.out.println("Please input number two numbers");

        try {
            System.out.println("put first");
            numberOne =Integer.parseInt(br.readLine());
            System.out.println("put second");
            numberTwo =Integer.parseInt(br.readLine());
            result = multiply(numberOne,numberTwo);
            System.out.println("multiplying  is " +  result);

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You don't put wrong number try again" + ConsoleColors.RESET);
            Task2.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task2.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    DoubleInteger.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

        public static int multiply ( int num1, int num2)throws ArithmeticException {
            BigInteger br = BigInteger.valueOf(num1).multiply(BigInteger.valueOf(num2));
            return br.intValueExact();
        }

}