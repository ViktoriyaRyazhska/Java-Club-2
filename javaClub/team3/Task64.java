package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task64 extends Task{
    @Override
    void execute() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = scanner.nextLine();
            System.out.println("Enter the letter:");
            char letter = scanner.next().charAt(0);

            System.out.println("Number of the letter in string is "+ CodeWars.strCount(str, letter));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static class CodeWars {
        public static int strCount(String str, char letter) {
            int counter =0;
            for (char element : str.toCharArray()){
                if (element == letter) counter++;
            }
            return counter;
        }
    }
}
