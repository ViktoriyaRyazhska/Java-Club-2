package javaClub.team3;
//https://www.codewars.com/kata/twice-as-old/

/* @Test
 * call TwiceAsOld.twiceAsOld
 *
 * Exceptions:
 * InputMismatchException when dadYears <= 0
 * InputMismatchException when sonYears < 0
 * InputMismatchException when sonYears > dadYears
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task42 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int dadYears, sonYears;
        System.out.println("Print dad years value");
        try {
            dadYears = scanner.nextInt();
            if (dadYears <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print son years value");
        try {
            sonYears = scanner.nextInt();
            if (sonYears < 0) throw new InputMismatchException();
            if (sonYears > dadYears) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(TwiceAsOld.twiceAsOld(scanner.nextInt(), scanner.nextInt()));
    }

    public static class TwiceAsOld{
        public static int twiceAsOld(int dadYears, int sonYears){
            if (dadYears <= 0) throw new InputMismatchException();
            if (sonYears < 0) throw new InputMismatchException();
            if (sonYears > dadYears) throw new InputMismatchException();
            return ((sonYears*2)-dadYears < 0) ? -((sonYears*2)-dadYears) : ((sonYears*2)-dadYears);
        }
    }
}

