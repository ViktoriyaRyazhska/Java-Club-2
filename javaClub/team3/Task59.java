package javaClub.team3;

import java.util.InputMismatchException;

public class Task59 extends Task{
    @Override
    void execute() {
        System.out.println("Enter the letter:");
        try{
            char num = scanner.next().charAt(0);
            Kata59 kata = new Kata59();
            System.out.println(kata.position(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

class Kata59
{
    public String position(char alphabet)
    {
        String alphabet1 = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: "+(alphabet1.indexOf(alphabet)+1);
    }
}