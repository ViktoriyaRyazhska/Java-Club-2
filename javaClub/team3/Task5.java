package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Jenny has written a function that returns a greeting for a user.
//However, she's in love with Johnny, and would like to greet him
//slightly different. She added a special case to her function, but she made a mistake.

public class Task5 extends Task{
    String name = null;
    @Override
    void execute() {
        try{
            System.out.println("Please enter name: ");
            name = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(greet(name));
    }

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }
}
