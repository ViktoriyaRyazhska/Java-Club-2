package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Your function should take two arguments: the size of the wall in millimeters and the size of
//a pixel in millimeters. It should return True if you can fit  an exact number of pixels on
//the wall, otherwise it should return False. For example is_divisible(4050, 27) should return
//True, but is_divisible(4066, 27)should return False.

public class Task4 extends Task{

    @Override
    void execute() {
        System.out.println("Please enter the size of the wall in millimeters and the size of a pixel in millimeters: ");
        try{
            String[] numbers = GetData();
            while(numbers[0]== null || numbers[1] == null){
                System.out.println("Something is wrong. Enter numbers again: ");
                numbers = GetData();
            }
            while(Integer.parseInt(numbers[0]) < Integer.parseInt(numbers[1])){
                System.out.println("The size of the wall can`t be smaller then the size of a pixel. Enter numbers again: ");
                numbers = GetData();
            }
            if(IsDivisible(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])) == true){
                System.out.println("Your pixel art is going to be perfect!");
            } else {
                System.out.println("Oh no! You can`t fit an exact number of pixels on the wall!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean IsDivisible(int wallLength, int pixelSize)
    {
        return wallLength%pixelSize == 0;
    }
    public String[] GetData(){
        String input  = scanner.nextLine();
        String[] numbers = input.split(" ");
        return numbers;
    }

}
