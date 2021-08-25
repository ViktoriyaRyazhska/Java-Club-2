package javaClub.team3;

import java.util.InputMismatchException;

public class Task54 extends Task{
    @Override
    void execute() {
        System.out.println("Enter the number:");
        try{
            int num = scanner.nextInt();
            Kata54 kata = new Kata54();
            System.out.println("The opposite number is " + kata.opposite(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

class Kata54
{
    public static int opposite(int number)
    {
        return -1*number;
    }
}