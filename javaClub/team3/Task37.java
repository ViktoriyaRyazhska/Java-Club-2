package javaClub.team3;
//https://www.codewars.com/kata/reversed-sequence/
/* @Test
 * call Sequence.reverse
 *
 * Exceptions:
 * InputMismatchException when n <= 0
 */
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task37 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Print number to get array");
        try {
            n = scanner.nextInt();
            if (n <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        int[] res = Sequence.reverse(scanner.nextInt());
        System.out.println(Arrays.toString(res));
    }

    public static class Sequence{
        public static int[] reverse(int n){
            if (n <= 0) throw new InputMismatchException();

            int[] res = new int[n];
            for (int i = n; i > 0; i--) {
                res[n-i] = i;
            }
            return res;
        }
    }
}

