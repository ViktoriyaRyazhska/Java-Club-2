package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Your function should take two arguments: the size of the wall in millimeters and the size of
//a pixel in millimeters. It should return True if you can fit  an exact number of pixels on
//the wall, otherwise it should return False. For example is_divisible(4050, 27) should return
//True, but is_divisible(4066, 27)should return False.

public class Task4 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input  = null;
        try{
            System.out.println("Please enter the size of the wall in millimeters and the size of a pixel in millimeters: ");
            input  = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] numbers = input.split(" ");
        if(IsDivisible(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])) == true){
            System.out.println("Your pixel art is going to be perfect!");
        } else {
            System.out.println("Oh no! You can`t fit an exact number of pixels on the wall!");
        }
    }

    public static boolean IsDivisible(int wallLength, int pixelSize)
    {
        return wallLength%pixelSize == 0;
    }
}
