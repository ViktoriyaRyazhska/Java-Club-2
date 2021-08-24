package javaClub.team3;

import java.util.InputMismatchException;
import java.util.stream.IntStream;

public class Task44 extends Task{
    @Override
    void execute() {
        System.out.println("Enter the number : ");
        try{
            int num = scanner.nextInt();
            while(num <=0){
                System.out.println("Something is wrong. Enter the number again: ");
                num = scanner.nextInt();
            }
            System.out.println("The summation is "+summation(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
    public static int summation(int n) {
        return IntStream.range(1, n + 1).sum();
    }
}
