package tasks;

import java.util.Scanner;

/*
https://www.codewars.com/kata/return-negative
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative.
Notes:
The number can be negative already, in which case no change is required.
Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer");

        if(scan.hasNextInt()){

        Integer i = scan.nextInt();

        if(i<=0){
            System.out.println(i);
        }
        else
        System.out.println("-" + i);
    }
        else System.out.println("Wrong input! Try again!");
        
}
}
