package javaClub.team3;

//https://www.codewars.com/kata/string-repeat

import java.util.Scanner;

public class Task32 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print repeats number and string to repeat");
        Solution solution = new Solution();
        System.out.println(solution.repeatStr(scanner.nextInt(), scanner.nextLine()));
    }
}

class Solution {
    public String repeatStr(final int repeat, final String string) {
        String buff = "";
        for (int i = 0; i < repeat; i++) {
            buff += string;
        }
        return buff;
    }
}

