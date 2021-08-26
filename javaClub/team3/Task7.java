/*
* Clock shows h hours, m minutes and s seconds after midnight.
* Your task is to write a function which returns the time since midnight in milliseconds.
* https://www.codewars.com/kata/beginner-series-number-2-clock/
* */
package javaClub.team3;
/* @Test
 * call Past.past
 *
 * Exceptions:
 * InputMismatchException when any value < 0
 * InputMismatchException when h > 23
 * InputMismatchException when m,s > 59
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int h, m, s;
        System.out.println("Input hours");
        try {
            h = scanner.nextInt();
            if (h < 0 || h > 23) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Input minutes");
        try {
            m = scanner.nextInt();
            if (m < 0 || m > 59) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Input hours");
        try {
            s = scanner.nextInt();
            if (s < 0 || s > 59) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Result: " + Past.past(h, m, s));
    }

    public static class Past {
        public static long past(int h, int m, int s) {
            if (h < 0 || h > 23) throw new InputMismatchException();
            if (m < 0 || m > 59) throw new InputMismatchException();
            if (s < 0 || s > 59) throw new InputMismatchException();
            return ((((h* 60L)+m)*60)+s)*1000;
        }
    }
}
