package javaClub.team3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task69 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to add:");
        try{
            push();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static String push(){
        List<String> items = new ArrayList<>();
        items.add("an object");
        return "The object is added!";
    }
}
