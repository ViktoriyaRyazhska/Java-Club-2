package javaClub.team3;

/*      Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow (including myself).
        It's the 'recommended' age range in which to date someone.


        minimum age <= your age <= maximum age #Task

        Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.

        This equation doesn't work when the age <= 14, so use this equation instead:

        min = age - 0.10 * age
        max = age + 0.10 * age
        You should floor all your answers so that an integer is given instead of a float (which doesn't represent age).
        Return your answer in the form [min]-[max]

        ##Examples:

        age = 27   =>   20-40
        age = 5    =>   4-5
        age = 17   =>   15-20*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 extends Task{
    int age = 0;
    @Override
    void execute() {
        try {
            System.out.println("Please enter your age: ");
            age = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Not a number!");
        }
        System.out.println(datingRange(age));
    }

    public static String datingRange(int age) {
        //return min-max
        int min = 0;
        int max = 0;
        if (age < 1 || age > 100) {
            return "Wrong age!";
        } else {
            if (age <= 14) {
                min = (int) (age - 0.10 * age);
                max = (int) (age + 0.10 * age);
            } else {
                min = age / 2 + 7;
                max = (age - 7) * 2;
            }
        }
        return "age = " + age + "   =>   " + min + "-" + max;
    }
}
