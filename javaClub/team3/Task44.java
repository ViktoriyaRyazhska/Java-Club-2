package javaClub.team3;

import java.util.InputMismatchException;
import java.util.stream.IntStream;

public class Task44 extends Task{

    @Override
    void execute() {
        System.out.println("Enter the number : ");
        try{
            int num = scanner.nextInt();
            GrassHopper gr = new GrassHopper();
            System.out.println("The summation is " + gr.summation(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

class GrassHopper {
    public static int summation(int n) {
        return IntStream.range(1, n + 1).sum();
    }
}