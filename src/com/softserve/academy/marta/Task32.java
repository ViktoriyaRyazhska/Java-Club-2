package com.softserve.academy.loops;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Input;
import com.softserve.academy.Main;

import java.io.IOException;

public class Task32 extends Input {
    public static void main(String args[]){
        String str;
        int num;
        try{
        System.out.println("Please, write in the phrase and the number: ");
        System.out.println("Phrase: ");
        str = br.readLine();
        System.out.println("Number: ");
        num = Integer.parseInt(br.readLine());
        System.out.println(ConsoleColors.YELLOW + repeatStr(num, str));
        }catch (IOException | NumberFormatException e){
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);}

        System.out.println(ConsoleColors.GREEN + "Back to main menu input:  1 ");
        System.out.println("Try again  input:  2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task32.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task32.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }
    }
    public static String repeatStr(int n, String str){
        if(n < 0) throw new IllegalArgumentException("1");
        String result = "";
        for(int i = 0; i < n; i++)
            result += str;
        return result;
    }

}
