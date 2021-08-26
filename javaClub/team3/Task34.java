package javaClub.team3;

import java.io.IOException;
import java.util.Scanner;

public class Task34 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        try {
            int length = whileCheck();
            int[] myArray = new int[length];
            for (int i =0; i< length; i++){
                System.out.println("Enter the "+(i+1)+". number: ");
                myArray[i] = whileCheck();
            }
            System.out.println("The average mark is "+getAverage(myArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int whileCheck(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num <=0){
            System.out.println("Something is wrong. Enter the number again: ");
            num = scanner.nextInt();
        }
        return num;
    }

    public int getAverage(int[] marks){
        int sum = 0;
        for(int i =0; i<marks.length; i++){
            sum+=marks[i];
        }
        return Math.round(sum/(marks.length));
    }
}
