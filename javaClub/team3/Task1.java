package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the number to double:");
            int num = scanner.nextInt();
            Java jav = new Java();
            System.out.println(jav.doubleInteger(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static class Java {
        public static int doubleInteger(int i) {
            return i*2;
        }
    }
}
