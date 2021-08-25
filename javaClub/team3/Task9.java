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

public class Task9 extends Task{
    @Override
    void execute() {
        System.out.println("Please enter a number: ");
        try {
            int num = scanner.nextInt();
            System.out.println("Done!");
            Kata9 kata = new Kata9();
            System.out.println(kata.MakeNegative(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Kata9 {
    public static int MakeNegative(int number) {
        return Math.abs(number) * -1;
    }
}