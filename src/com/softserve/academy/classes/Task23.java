package com.softserve.academy.classes;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;
import com.softserve.academy.conditions.Task27;

import java.io.IOException;

import static com.softserve.academy.Input.br;

public class Task23 {
    public static void main(String[] args) {
        String command1;
        String command2;

        try{
            System.out.println("Write in the first symbol:  (scissors / rock / paper)");
            command1 = br.readLine();
           if (!command1.equals("scissors") && !command1.equals("rock") && !command1.equals("paper")) throw new IOException("Illegal input");
            System.out.println("Write in the second symbol: ");
            command2 = br.readLine();
            if (!command1.equals("scissors") && !command1.equals("rock") && !command1.equals("paper")) throw new IOException("Illegal input");

            System.out.println(rsp(command1, command2));

        }
        catch(IOException | NumberFormatException e){
            System.out.println(ConsoleColors.RED + "You put wrong value, try again" + ConsoleColors.RESET);
            Task23.main(args);

        }

        System.out.println(ConsoleColors.GREEN + "Back to main menu input:  1 ");
        System.out.println("Try again  input:  2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task23.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need to put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task23.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Main.main(args);
        }



    }

    public static String rsp(String command1, String command2){
        if(!command1.equals(command2)) {
        int num = 0;
        switch (command1){
            case "scissors":
                if(command2.equals("rock")) num = 2;
                else num = 1;
                break;
            case "rock":
                if(command2.equals("paper")) num = 2;
                else num = 1;
                break;
            case "paper":
                if(command2.equals("scissors")) num = 2;
                else num = 1;
        }
        return "The winner is player number " + num + ". Congratulations!";}
        return "Draw";
    }
}
