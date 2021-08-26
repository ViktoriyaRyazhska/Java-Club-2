package javaClub.team3;
//https://www.codewars.com/kata/reversed-strings

/* @Test
 * call Kata52.solution
 *
 * Exceptions:
 * InputMismatchException when empty string
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task52 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        String value;
        System.out.println("Print string to reverse");
        try {
            value = scanner.nextLine();
            if (value.length() == 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(Kata52.solution(value));
    }

    public static class Kata52 {
        public static String solution(String str) {
            if (str.length() == 0) throw new InputMismatchException();
            return new StringBuilder().append(str).reverse().toString();
        }
    }
}

