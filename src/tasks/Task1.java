package tasks;

import java.util.Scanner;
/*
https://www.codewars.com/kata/you-cant-code-under-pressure-number-1/
You need to double the integer and return it.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your integer number:");
        int i;
        do {
            try {
                String s = scan.nextLine();
                i = Integer.parseInt(s);
                break;
            }
            catch (Exception wrongInputDataType) {
                System.out.println("Wront input data type...");
            }
        } while (true);
        System.out.println(Task1.doubleInt(i));
    }

    public static int doubleInt( int i){
        i=i*2;
        return i;
    }
}
