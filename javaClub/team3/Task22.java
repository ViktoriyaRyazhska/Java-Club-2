package javaClub.team3;
//https://www.codewars.com/kata/how-old-will-i-be-in-2099/
/* @Test
 * call AgeDiff.calculateAge
 *
 * Samples:
 * birth < yearTo = "You are * year old."
 * birth > yearTo = "You will be born in * year."
 * birth == yearTo = "You were born this very year!"
 *
 * no exception // negative values is correct due to -5 year is same as 5 year B.C.
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task22 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int birth, yearTo;
        System.out.println("Print your birth year");
        try {
            birth = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print year you want to know how old you will/were");
        try {
            yearTo = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(AgeDiff.calculateAge(birth, yearTo));
    }
    public static class AgeDiff {
        public static String calculateAge(int birth, int yearTo) {
            if (birth < yearTo) {
                if (yearTo-birth == 1) return ("You are " + (yearTo-birth) + " year old.");
                return ("You are " + (yearTo-birth) + " years old.");
            } else {
                if (birth > yearTo) {
                    if (birth-yearTo == 1) return ("You will be born in " + (birth-yearTo) + " year.");
                    return ("You will be born in " + (birth-yearTo) + " years.");
                } else {
                    return ("You were born this very year!");
                }
            }
        }
    }
}

