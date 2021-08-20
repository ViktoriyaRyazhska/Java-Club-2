/*
* Clock shows h hours, m minutes and s seconds after midnight.
* Your task is to write a function which returns the time since midnight in milliseconds.
* https://www.codewars.com/kata/beginner-series-number-2-clock/
* */

package javaClub.team3;

public class Task7 extends Task{
    @Override
    void execute() {
        System.out.println("Input h, m, s values");
        try {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            System.out.println("Milliseconds: " + past(h, m, s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int past(int h, int m, int s) {
        return ((((h*60)+m)*60)+s)*1000;
    }
}
