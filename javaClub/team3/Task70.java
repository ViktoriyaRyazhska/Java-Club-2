package javaClub.team3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Unfinished Loop - Bug Fixing #1
//Oh no, Timmy's created an infinite loop!
// Help Timmy find and fix the bug in his unfinished for loop!

public class Task70 extends Task {

    @Override
    void execute() {
        int size = 0;
        System.out.println("In this task we should just fix bug which was missing \"count++\".");
        System.out.println("Please enter a number: ");
        try {
            size = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
        }
        if (size <= 0){
            System.err.println("Wrong input!");
        } else{
            System.out.println(createList(size));
        }
    }

    public static List createList(int number) {
        List list = new ArrayList();
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
}
