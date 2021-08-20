package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//In this simple assignment you are given a number and have to make
//it negative. But maybe the number is already negative? Example:
//
//Kata.MakeNegative(1); // return -1
//Kata.MakeNegative(-5); // return -5
//Kata.MakeNegative(0); // return 0

public class Task9 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            System.out.println("Please enter a number: ");
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
        System.out.println(MakeNegative(Integer.parseInt(input)));
    }

    public static int MakeNegative(int number)
    {
        return Math.abs(number)*-1;
    }
}
