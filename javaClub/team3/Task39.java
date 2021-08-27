package javaClub.team3;

import java.util.Scanner;

public class Task39 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        try {
            int length = whileCheck();
            int[] myArray = new int[length];
            for (int i =0; i< length; i++){
                System.out.println("Enter the "+(i+1)+". number: ");
                myArray[i] = scanner.nextInt();
            }
            System.out.println("The result of grown is "+grow(myArray));
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
    public static int grow(int[] x){
        int res = x[0];
        for(int i =1; i< x.length; i++){
            res*=x[i];
        }
        return res;
    }
}
