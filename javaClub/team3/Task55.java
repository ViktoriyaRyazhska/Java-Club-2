package javaClub.team3;

import java.io.IOException;

//https://www.codewars.com/kata/596c6eb85b0f515834000049/train/java
//The code provided is supposed replace all the dots . in the specified String str with dashes -
//But it's not working properly.

public class Task55 extends Task{

    @Override
    void execute() {
        String str = "";
        System.out.println("Please input your string: ");
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("String with dots replaced by '-'");
        System.out.println(replaceDots(str));
    }
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}
