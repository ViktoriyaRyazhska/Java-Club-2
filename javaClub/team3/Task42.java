package javaClub.team3;
//https://www.codewars.com/kata/twice-as-old/
public class Task42 extends Task{
    @Override
    void execute() {
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