package com.softserve.academy.basic;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;
import com.softserve.academy.classes.Task22;

import java.io.IOException;

public class Task10 extends Input {
    public static void main(String args[]){
        int age;

        try{
           System.out.println("Write in your age please: ");
           age = Integer.parseInt(br.readLine());
           System.out.println("Your minimum-maximum dating age looks like : " + age(age));
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
                    Task10.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task10.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }
    public static String age(int myage){
        if(myage < 1 || myage > 100) throw new IllegalArgumentException("1");
        double min = myage - 0.10 * myage;
        double max = myage + 0.10 * myage;
        int res1 = (int) min;
        int res2 = (int) max;
        String res = res1 + "-" + res2;
        return res;
    }
}
