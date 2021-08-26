/*
* Implement a function which multiplies two numbers.
*
* https://www.codewars.com/kata/function-3-multiplying-two-numbers/
* */

package javaClub.team3;
/* @Test
 * call Multiply.multiply
 *
 * Exceptions:
 * InputMismatchException when a*b result > Integer.MAX_VALUE
 * */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first (a) number to multiply");
        int a;
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Input second (b) number to multiply");
        int b;
        try {
            b = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        try {
            if ((long)a*b > Integer.MAX_VALUE) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Result is out of int size");
            return;
        }
        System.out.println("Result: " + Multiply.multiply(a, b));
    }

    public static class Multiply {
        public static int multiply(int num1, int num2) {
            if ((long)num1*num2 > Integer.MAX_VALUE) throw new InputMismatchException("Result is out of int size");
            return num1*num2;
        }
    }
}
