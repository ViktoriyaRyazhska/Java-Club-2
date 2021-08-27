package tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int num1;

        System.out.print("\tTask 8.\n\t\t\n Century From Year. \n");
        System.out.println("The first century spans from the year 1 up to and including the year 100, \n" +
                "The second - from the year 101 up to and including the year 200, etc. " +
                "Given a year, return the century it is in..\n");


        System.out.print("Enter a year:");
        Scanner sc = new Scanner(System.in);

        do {
            try {
                num1 = Integer.parseInt(sc.nextLine());
                if (num1 < 1) {
                    throw new Exception("Value must be integer and > 0!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Input valid integer value:");
            }
        } while (true);
        System.out.println(century(num1));
    }
    public static int century(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Input value should be positive and > 0");
        }
        double century = (double) number / (double) 100;
        if (century == (int) century) {
            return (int) century;
        } else {
            return (int) century + 1;
        }
    }
}
