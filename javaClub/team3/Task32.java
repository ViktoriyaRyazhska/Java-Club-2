package javaClub.team3;

//https://www.codewars.com/kata/string-repeat

/* @Test
 * call Solution.repeatStr
 *
 * Exceptions:
 * InputMismatchException when repeat <= 0
 * InputMismatchException when result is out of string size (Integer.MAX_VALUE)
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task32 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int repeats;
        String string;
        System.out.println("Print number of repeats");
        try {
            repeats = scanner.nextInt();
            if (repeats <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print string to repeats");
        try {
            string = scanner.nextLine();
            if (string.length()*(long)repeats > Integer.MAX_VALUE) throw new InputMismatchException("Result is out of String range");
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(Solution.repeatStr(repeats, string));

    }
    public static class Solution {
        public static String repeatStr(final int repeat, final String string) {
            if (repeat <= 0) throw new InputMismatchException();
            if ((long)repeat*string.length() > Integer.MAX_VALUE) throw new InputMismatchException("Result is out of String size");

            return string.repeat(repeat);
        }
    }
}



