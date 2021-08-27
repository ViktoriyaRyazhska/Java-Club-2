package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;
import java.util.function.Predicate;


public class Task24 extends Input {
    public static void main(String[] args) {

        int first;
        int second;
        String operator;

        System.out.println("\nTask 24: basic calculator. ");

        try {
            System.out.print("Enter operator (*, +, -, /): ");
            operator = br.readLine();
            if (operator.equals("*") || operator.equals("+") || operator.equals("-") || operator.equals("/")) {
                System.out.print("Enter first number: ");
                first = Integer.parseInt(br.readLine());
                System.out.print("Enter second number: ");
                second = Integer.parseInt(br.readLine());
                System.out.println("Result: " + basicMath(operator, first, second));
            }
            else {
                throw new IOException();
            }

        } catch (IOException |
                NumberFormatException | ArithmeticException e) {
            System.out.println(ConsoleColors.RED + "You have done something wrong, please try again" + ConsoleColors.RESET);
            Task24.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task24.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task24.main(args);
            }
        } catch (
                IOException | NullPointerException | ArithmeticException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static int basicMath(String op, int v1, int v2) {
        if (op == null || (Integer) v1 == null || (Integer) v2 == null) {
            throw new NullPointerException();
        }

        if (op.equals("*") || op.equals("+") || op.equals("-") || op.equals("/")) {
            long result;

            Predicate<Long> isOverflowed = x -> x < Integer.MIN_VALUE || x > Integer.MAX_VALUE;

            if (op.equals("+")) {
                result = (long) v1 + (long) v2;
                if (isOverflowed.test(result)) throw new ArithmeticException();
                return (int) result;
            }

            if (op.equals("/")) {
                if (v2 == 0) throw new ArithmeticException();
                result = (long) v1 / (long) v2;
                if (isOverflowed.test(result)) throw new ArithmeticException();
                return (int) result;
            }

            if (op.equals("*")) {
                result = (long) v1 * (long) v2;
                if (isOverflowed.test(result)) throw new ArithmeticException();
                return (int) result;
            }

            result = (long) v1 - (long) v2;
            if (isOverflowed.test(result)) throw new ArithmeticException();
            return (int) result;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
