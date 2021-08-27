package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task19 extends Task {
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the first number: ");
            long first = scanner.nextLong();
            System.out.println("Enter the second number: ");
            long second = scanner.nextLong();
            System.out.println("Enter the third number: ");
            long third = scanner.nextLong();
            System.out.println(isDivisible(first, second, third));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }


    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}