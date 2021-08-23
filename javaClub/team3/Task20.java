package javaClub.team3;

//          Implement a function which convert the given boolean value into its string representation.
//
//        Note: Only valid inputs will be given.

import java.io.IOException;

public class Task20 extends Task{

    @Override
    void execute() {
        int input = 0;
        System.out.println("Please enter 0 for \"false\" or 1 for \"true\".");
        try {
            input = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Wrong input!");
        }
        switch (input){
            case 0:
                System.out.println(convert(false));
                break;
            case 1:
                System.out.println(convert(true));
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
    }

    public static String convert(boolean b){
        if(b) {
            return "true";
        } else {
            return "false";
        }
    }
}
