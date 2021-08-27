package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task34 extends Input {

    public static void main(String args[]){
        int[] array;
        Integer quantity;
        int mark;


        try {
            System.out.println("How many students do you have? ");
            quantity = Integer.parseInt(br.readLine());
            array = new int[quantity];
            for(int i = 0; i < quantity; i++){
                mark = Integer.parseInt(br.readLine());
                array[i] = mark;
            }
            System.out.println("The average mark is :  " + average(array));
        }catch(IOException | NumberFormatException e){
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);}

        System.out.println(ConsoleColors.GREEN + "Back to main menu input:  1 ");
        System.out.println("Try again  input:  2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task34.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task34.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }

    }
    public static int average(int[] arr){
        if(arr.length == 0) throw  new IllegalArgumentException("1");
        int result;
        double semires = 0;
        for(int i = 0; i < arr.length; i++)
            semires += arr[i];
        semires /= arr.length;
        result = (int)semires;
        return result;
    }
}

