package javaClub.team3;
//https://www.codewars.com/kata/counting-sheep-dot-dot-dot/
public class Task36 extends Task{
    @Override
    void execute() {

    }
    public class Counter {
        public int countSheeps(Boolean[] arrayOfSheeps) {
            if (arrayOfSheeps == null) return 0;
            if (arrayOfSheeps.length == 0) return 0;
            int counter = 0;
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i] == null) continue;
                if (arrayOfSheeps[i]) counter++;
            }
            return counter;
        }
    }
}
