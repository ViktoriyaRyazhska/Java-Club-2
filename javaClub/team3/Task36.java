package javaClub.team3;
//https://www.codewars.com/kata/counting-sheep-dot-dot-dot/

import java.util.InputMismatchException;

/* @Test
 * call Counter.countSheeps
 * for input sample goto codewars up there
 *
 * Exceptions:
 * no exceptions
 */
public class Task36 extends Task{
    @Override
    void execute() {
        System.out.println("Forget about this task"); //hard to do correct user input
    }
    public static class Counter {
        public static int countSheeps(Boolean[] arrayOfSheeps) {
            if (arrayOfSheeps.length == 0) return 0;
            int counter = 0;
            for (Boolean arrayOfSheep : arrayOfSheeps) {
                if (arrayOfSheep == null) continue;
                if (arrayOfSheep) counter++;
            }
            return counter;
        }
    }
}
