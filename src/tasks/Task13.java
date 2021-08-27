package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.codewars.com/kata/fixme-static-electrickery/
The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.
But it's not working properly.
Task:
Fix the code so we can all go home early.
Restrictions:
Do not modify the constructor
Do not modify the plus100 method
Do not modify the ONE_HUNDRED declaration
 */

public class Task13 {
    private static int ONE_HUNDRED = 100;

    public static final Task13 INST = new Task13();

    private final int value;

    private Task13() {
        value = ONE_HUNDRED;
    }


    public static void main(String[] args) {

        int number;

        try {
            System.out.print("Enter number: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(br.readLine());
            System.out.println("Number : " + Task13.INST.plus100(number));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println("You have not entered number in correct way, please try again");
            Task13.main(args);
        }




    }


    public int plus100(int n) {
        return value + n;
    }


}
