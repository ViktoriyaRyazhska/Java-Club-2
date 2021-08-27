package javaClub.team3;
//https://www.codewars.com/kata/are-you-playing-banjo/

import java.util.InputMismatchException;
import java.util.Scanner;

/* @Test
 * call Banjo.areYouPlayingBanjo
 *
 * Samples:
 * if name begins on r/R = * plays banjo
 * else = * does not play banjo
 *
 * Exceptions:
 * InputMismatchException when empty name
 */
public class Task56 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter player name");
        try {
            name = scanner.nextLine();
            if (name.length() == 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(Banjo.areYouPlayingBanjo(name));
    }
    public static class Banjo {
        public static String areYouPlayingBanjo(String name) {
            if (name.length() == 0) throw new InputMismatchException();
            if (name.toLowerCase().charAt(0) == 'r') return name+" plays banjo";
            else return name+" does not play banjo";
        }
    }
}
