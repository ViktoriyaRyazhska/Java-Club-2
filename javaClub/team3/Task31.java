package javaClub.team3;

//https://www.codewars.com/kata/568d0dd208ee69389d000016/train/java

import java.io.IOException;

public class Task31 extends Task {

    @Override
    void execute() {
        try {
            System.out.println("Please enter number of the days of your car rent: ");
            int days = Integer.parseInt(bufferedReader.readLine());
            if (days < 0) {
                System.err.println("You have entered negative number of the days.");
                return;
            }
            System.out.println("Your total amount will be: " + rentalCarCost(days));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Not a number!");
        }
    }

    public static int rentalCarCost(int d) {
        return d >= 7 ? 40 * d - 50 : d >= 3 ? 40 * d - 20 : 40 * d;
    }
}
