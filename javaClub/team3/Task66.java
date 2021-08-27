package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task66 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the string to correct:");
            String num = scanner.nextLine();
            Correct jav = new Correct();
            System.out.println("The result is "+jav.correct(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
    public static class Correct {
        public static String correct(String string) {
            string = string.replace('5', 'S');
            string = string.replace('0', 'O');
            string = string.replace('1', 'I');
            return string;
        }
    }
}
