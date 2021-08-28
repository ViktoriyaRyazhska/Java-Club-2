package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task21{

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter salary: ");
            int n = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Do bonus ?(y/n): ");
            String bonus = bufferedReader.readLine();
            System.out.println(bonusTime(n, bonus.equals("y")));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Not a number!");
        }

    }

    public static String bonusTime(final int salary, final boolean bonus) {
        if (salary < 0) throw new InputMismatchException();
        else return "£" + (bonus ? salary * 10 : salary);
    }
}
