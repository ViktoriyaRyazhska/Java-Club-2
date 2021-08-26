package javaClub.team3;

//https://www.codewars.com/kata/convert-to-binary

import java.io.IOException;

public class Task6 extends Task{

    @Override
    void execute() {
        try {
            System.out.println("Please input non-negative integer: ");
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num < 0){
                System.err.println("You have entered negative number!");
                return;
            }
            System.out.println(toBinary(num));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
        }
    }
    public static long toBinary(int n) {
        return Long.parseLong(Integer.toBinaryString(n));
    }
}
