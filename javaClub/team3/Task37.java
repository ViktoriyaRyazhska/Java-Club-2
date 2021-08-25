package javaClub.team3;

import java.util.Arrays;

//https://www.codewars.com/kata/reversed-sequence/
public class Task37 extends Task{
    @Override
    void execute() {
        System.out.println("Print number to get array");
        Sequence sequence = new Sequence();
        int[] res = sequence.reverse(scanner.nextInt());
        System.out.println(Arrays.toString(res));
    }
}

class Sequence{
    public int[] reverse(int n){
        int[] res = new int[n];
        for (int i = n; i > 0; i--) {
            res[n-i] = i;
        }
        return res;
    }
}