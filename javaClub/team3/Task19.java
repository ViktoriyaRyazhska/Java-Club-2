package javaClub.team3;

import java.util.Scanner;

public class Task19 extends Task {
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            int n=0,a=0,b=0;
            System.out.println("Enter the first number: ");
            EnterNumber(n);
            System.out.println("Enter the second number: ");
            EnterNumber(a);
            System.out.println("Enter the third number: ");
            EnterNumber(b);
            System.out.println(isDivisible(n,a,b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void EnterNumber(long a){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        while(a < 0){
            System.out.println("Something is wrong/ Enter the number again:");
            a = scanner.nextLong();
        }
    }

    public static boolean isDivisible(long n, long x, long y) {
        if(n%x == 0 && n%y == 0){
            return true;
        }
        else{
            return false;
        }
    }
}