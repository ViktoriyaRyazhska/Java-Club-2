package tasks;

import java.util.Scanner;

/*
https://www.codewars.com/kata/jennys-secret-message
Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny, and would like to greet him slightly different.
She added a special case to her function, but she made a mistake.
Can you help her?
 */

public class Task5 {
    public static String Greet(String name){
        if(name.equals("Johnny"))
            return "Hello, my love!";
        else
            return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        while (!name.matches("[a-zA-Z]+")) {
            System.out.println("Wrong input. Try again:");
            name = sc.nextLine();
            Task5.main(args);
        }

        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        System.out.println(Greet(name));
    }

}
