package javaClub.team3;

import java.util.InputMismatchException;

public class Task59 extends Task{
    @Override
    void execute() {
        System.out.println("Enter the letter:");
        try{
            char num = scanner.next().charAt(0);
            System.out.println(position(num));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static String position(char letter)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: "+(alphabet.indexOf(letter)+1);
    }
}
