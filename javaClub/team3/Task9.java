package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//In this simple assignment you are given a number and have to make
//it negative. But maybe the number is already negative? Example:
//
//Kata.MakeNegative(1); // return -1
//Kata.MakeNegative(-5); // return -5
//Kata.MakeNegative(0); // return 0

public class Task9 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        try {
            String input = scanner.nextLine();
            System.out.println("Done!");
            System.out.println(MakeNegative(Integer.parseInt(input)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int MakeNegative(int number)
    {
        return Math.abs(number)*-1;
    }

}