/*
* Clock shows h hours, m minutes and s seconds after midnight.
* Your task is to write a function which returns the time since midnight in milliseconds.
* https://www.codewars.com/kata/beginner-series-number-2-clock/
* */

package javaClub.team3;

import java.util.Scanner;

public class Task7 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int h, m, s;
        System.out.println("Input hours");
    }

    public static long past(int h, int m, int s) {
        return ((((h* 60L)+m)*60)+s)*1000;
    }
}
