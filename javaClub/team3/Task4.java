
package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

//Your function should take two arguments: the size of the wall in millimeters and the size of
//a pixel in millimeters. It should return True if you can fit  an exact number of pixels on
//the wall, otherwise it should return False. For example is_divisible(4050, 27) should return
//True, but is_divisible(4066, 27)should return False.

public class Task4 extends Task{

    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Please enter the size of the wall in millimeters : ");
            int wallLength = scanner.nextInt();
            System.out.println("Please enter the size of the pixel in millimeters : ");
            int pixelSize = scanner.nextInt();

            if(IsDivisible(wallLength, pixelSize)){
                System.out.println("Your pixel art is going to be perfect!");
            } else {
                System.out.println("Oh no! You can`t fit an exact number of pixels on the wall!");
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static boolean IsDivisible(int wallLength, int pixelSize)
    {
        return wallLength%pixelSize == 0;
    }

}