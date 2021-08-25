package javaClub.team3;

import java.io.IOException;
import java.util.Arrays;

//        Given an array of integers, return a new array with each value doubled.
//        For example:
//        [1, 2, 3] --> [2, 4, 6]

public class Task35 extends Task {

    @Override
    void execute() {
        int[] array = new int[3];
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
        int[] resultArr = map(array);
        System.out.println("Doubled array:");
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> i * 2).toArray();
    }
}
