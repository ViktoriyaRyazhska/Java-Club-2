package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public class Task35 extends Input {

    public static void main(String[] args) {


        int index;
        int[] array;
        String arrayString ;

        System.out.println("");
        System.out.println("Lops 35 ");
        System.out.println("Beginner - Lost Without a Map");
        System.out.println("Given an array of integers, return a new array with each value doubled");


        try {
            System.out.println("How meni index you wont to put ?");
            index = Integer.parseInt(br.readLine());
            array = new int[index];
            System.out.println("put value of index and pres enter");
            for(int i =0;i<index;i++){
                array[i] = Integer.parseInt(br.readLine());
            }
            arrayString = (Arrays.toString(map(array)));
            System.out.println("Double array");
            System.out.println(arrayString);



        } catch (IOException | NumberFormatException | NullPointerException |ArithmeticException e) {
            e.printStackTrace();
            System.out.println(ConsoleColors.RED + "You put wrong value try again" + ConsoleColors.RESET);
            Task35.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "Beak to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task35.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task35.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }



    public static int[] map(int[] arr) throws NullPointerException , ArithmeticException{
        if (arr == null){throw new NullPointerException(" array is null ");}
        BigInteger br;
        int [] doubleArray = new int [arr.length];
        for (int i = 0 ; i<arr.length; i++){

            br = BigInteger.valueOf(arr[i]).multiply(BigInteger.valueOf(2));
            doubleArray[i]= br.intValueExact();

        }
        return doubleArray;
    }
}