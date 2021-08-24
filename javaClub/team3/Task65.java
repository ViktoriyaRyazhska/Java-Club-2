package javaClub.team3;

import java.io.IOException;
import java.util.Arrays;

/*  https://www.codewars.com/kata/57cfdf34902f6ba3d300001e
    You will be given a vector of strings. You must sort it alphabetically
(case-sensitive, and based on the ASCII values of the chars) and then return the first value.
 The returned value must be a string, and have "***" between each of its letters.
You should not remove or add elements from/to the array.    */

public class Task65 extends Task{

    @Override
    void execute() {
        String input = "";
        System.out.println("Please input a string array separated by \" \":");
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(twoSort(input.split(" ")));
    }

    public static String twoSort(String[] s) {
        return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));
    }
}
