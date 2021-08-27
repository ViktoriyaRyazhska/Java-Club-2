package javaClub.team3;

import java.util.InputMismatchException;

public class Task64 extends Task{
    @Override
    void execute() {
        try{
            System.out.println("Enter the string:");
            String str = scanner.nextLine();
            System.out.println("Enter the letter:");
            char letter = scanner.next().charAt(0);

            CodeWars code= new CodeWars();
            System.out.println("Number of the letter in string is "+code.strCount(str, letter));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static class CodeWars {
        public static int strCount(String str, char letter) {
            int counter =0;
            for (char element : str.toCharArray()){
                if (element == letter) counter++;
            }
            return counter;
        }
    }
}
