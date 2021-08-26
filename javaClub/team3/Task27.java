package javaClub.team3;

//https://www.codewars.com/kata/will-there-be-enough-space/

import java.util.InputMismatchException;
import java.util.Scanner;
/* @Test
 * call Bob.enough
 *
 * Exceptions
 * InputMismatchException when cap <= 0
 * InputMismatchException when any value < 0
 */
public class Task27 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int cap, on, wait;
        System.out.println("Print cap bus value");
        try {
            cap = scanner.nextInt();
            if (cap <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print how many passengers on bus");
        try {
            on = scanner.nextInt();
            if (on < 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print how many passengers wait for bus");
        try {
            wait = scanner.nextInt();
            if (wait < 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(Bob.enough(cap, on, wait));
    }
    public static class Bob {
        public static int enough(int cap, int on, int wait){
            if (cap <= 0) throw new InputMismatchException();
            if (on < 0) throw new InputMismatchException();
            if (wait < 0) throw new InputMismatchException();

            return (Math.max((on + wait) - cap, 0));
        }
    }
}


