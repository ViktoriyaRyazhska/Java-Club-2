package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task26 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the true or false:");
            boolean ans = Boolean.valueOf(scanner.nextLine());
            YesOrNo jav = new YesOrNo();
            System.out.println("The result is "+jav.boolToWord(ans));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
    public static class YesOrNo
    {
        public static String boolToWord(boolean b)
        {
            return b ? "Yes" : "No";
        }

    }
}
