package javaClub.team3;

/*      https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
        Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 */

import java.io.IOException;

public class Task60 extends Task{
    @Override
    void execute() {
        String result = "";
        System.out.println("Please enter a string of digits: ");
        try {
            result = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (result.matches("\\d+")){
            System.out.println(fakeBin(result));
        } else{
            System.err.println("Invalid input!");
            return;
        }


    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
