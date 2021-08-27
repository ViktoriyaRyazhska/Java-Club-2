package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task54 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        try{
            int num = scanner.nextInt();

            System.out.println("The opposite number is "+opposite(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static int opposite(int number) { return -1*number; }
}
