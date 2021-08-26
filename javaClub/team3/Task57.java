package javaClub.team3;
//https://www.codewars.com/kata/remove-string-spaces/

/* @Test
 * call Kata57.noSpace
 *
 * Exceptions:
 * no exceptions
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task57 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Print string to remove spaces");
        try {
            str = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(Kata57.noSpace(str));
    }
    public static class Kata57 {
        public static String noSpace(final String x) {
            return x.replaceAll(" ", "");
        }
    }
}

