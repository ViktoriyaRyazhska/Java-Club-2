package javaClub.team3;

import java.io.IOException;
import java.util.Arrays;

//You get an array of numbers, return the sum of all of the positives ones.
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//Note: if there is nothing to sum, the sum is default to 0.

public class Task40 extends Task {

    @Override
    void execute() {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter " + (i + 1) + " number:");
            try {
                array[i] = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.err.println("Not a number!");
            }
        }
        System.out.println("The sum of all positive numbers is: " +sum(array));
    }

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }
}
