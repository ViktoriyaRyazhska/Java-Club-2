package javaClub.team3;

import java.util.Scanner;

//https://www.codewars.com/kata/twice-as-old/
public class Task42 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print dad and son years values");
        TwiceAsOld twiceAsOld = new TwiceAsOld();
        System.out.println(twiceAsOld.twiceAsOld(scanner.nextInt(), scanner.nextInt()));
    }
}

class TwiceAsOld{
    public int twiceAsOld(int dadYears, int sonYears){
        return ((sonYears*2)-dadYears < 0) ? -((sonYears*2)-dadYears) : ((sonYears*2)-dadYears);
    }
}