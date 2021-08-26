/*
* Debug celsius converter
* Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius.
* Unfortunately his code has some bugs.
* Find the errors in the code to get the celsius converter working properly.
* */

package javaClub.team3;
//https://www.codewars.com/kata/grasshopper-debug/

/* @Test
 * call Weather.weatherInfo
 *
 * Samples:
 * celsius <= 0 = * is freezing temperature
 * celsius > 0  = * is above freezing temperature
 *
 * Exceptions:
 * InputMismatchException when k < 0
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task11 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.println("Input temp in kelvin");
        try {
            k = scanner.nextInt();
            if (k < 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(Weather.weatherInfo(k));
    }

    public static class Weather {
        public static String weatherInfo(int temp) {
            double c = convertToCelsius(temp);
            if (c <= 0)
                return (c + " is freezing temperature");
            else
                return (c + " is above freezing temperature");
        }

        private static double convertToCelsius(int temperature) {
            return (temperature - 32) * (5.0/9.0);
        }
    }

}
