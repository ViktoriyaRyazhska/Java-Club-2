package javaClub.team3;

import java.io.IOException;

public class Task51 extends Task {

    @Override
    void execute() {
        try {
            System.out.println("Please enter a number: ");
            System.out.println("Your number string representation is: \""
                    + numberToString(Integer.parseInt(bufferedReader.readLine())) + "\"");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Not a number");
        }
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}
