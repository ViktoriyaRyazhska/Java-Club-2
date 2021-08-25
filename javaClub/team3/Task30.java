package javaClub.team3;

import java.io.IOException;

/*        You're writing code to control your town's traffic lights.
        You need a function to handle each change from green,
        to yellow, to red, and then to green again.
        Complete the function that takes a string as an argument
        representing the current state of the light and returns a string
        representing the state the light should change to.
        For example, update_light('green') should return 'yellow'.*/

public class Task30 extends Task{

    @Override
    void execute() {
        try {
            System.out.println("Please enter the current state of the light:");
            System.out.println(updateLight(bufferedReader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String updateLight(String current) {
        switch(current){
            case "green":
                return "yellow";
            case "yellow":
                return "red";
                //This is wrong IRL ;) :
            case "red":
                return "green";
            default:
                return "Wrong input!";
        }
    }
}
