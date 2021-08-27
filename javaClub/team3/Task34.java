package javaClub.team3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task34 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        try {
            int length = scanner.nextInt();
            int[] myArray = new int[length];
            for (int i =0; i< length; i++){
                System.out.println("Enter the "+(i+1)+". number: ");
                myArray[i] = scanner.nextInt();
            }
            System.out.println("The average mark is "+getAverage(myArray));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static int getAverage(int[] marks){
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return Math.round(sum/(marks.length));
    }
}
